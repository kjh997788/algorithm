import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        if (n == 1) {
            bw.write(scores[1] + "\n");
        } else {
            dp[1] = scores[1];
            dp[2] = scores[1] + scores[2];

            for (int i = 3; i <= n; i++) {
                dp[i] = Math.max(dp[i - 2], dp[i - 3] + scores[i - 1]) + scores[i];
            }

            bw.write(dp[n] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}