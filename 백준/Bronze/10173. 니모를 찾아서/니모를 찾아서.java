import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("EOI")) break;

            if (line.toLowerCase().contains("nemo")) {
                bw.write("Found");
            } else {
                bw.write("Missing");
            }
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}