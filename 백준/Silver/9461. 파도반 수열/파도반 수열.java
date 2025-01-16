import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = new long[101];
        dp[1] = dp[2] = dp[3] = 1;

        for (int i = 4; i < 101; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(dp[N] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}