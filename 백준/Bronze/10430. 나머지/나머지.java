import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int A = Integer.parseInt(inputNM[0]);
        int B = Integer.parseInt(inputNM[1]);
        int C = Integer.parseInt(inputNM[2]);


        bw.write(String.valueOf((A+B)%C));
        bw.newLine();
        bw.write(String.valueOf(((A%C) + (B%C))%C));
        bw.newLine();
        bw.write(String.valueOf((A*B)%C));
        bw.newLine();
        bw.write(String.valueOf(((A%C) * (B%C))%C));
        bw.newLine();

        bw.close();
        br.close();
    }
}