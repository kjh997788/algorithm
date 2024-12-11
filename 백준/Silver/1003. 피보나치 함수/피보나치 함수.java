import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] fibonacci = new int[41][2];

        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;
        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            fibonacci[i][0] = fibonacci[i - 1][0] + fibonacci[i - 2][0];
            fibonacci[i][1] = fibonacci[i - 1][1] + fibonacci[i - 2][1];
        }

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(fibonacci[N][0] + " " + fibonacci[N][1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}