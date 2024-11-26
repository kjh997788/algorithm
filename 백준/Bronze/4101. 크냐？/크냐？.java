import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] inputNM = br.readLine().split(" ");
            int n = Integer.parseInt(inputNM[0]);
            int m = Integer.parseInt(inputNM[1]);
            if (n == 0 && m == 0) break;
            if (n > m) {
                bw.write("Yes");
                bw.newLine();
            } else {
                bw.write("No");
                bw.newLine();
            }
        }
        
        bw.close();
        br.close();
    }
}