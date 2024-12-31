import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] sArr = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(sArr[j]);
            }
        }

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) { // 맨 왼쪽 값은 위에서 바로 내려오는 경우만 가능
                    dp[i][j] = dp[i - 1][j] + triangle[i][j];
                } else if (j == i) { // 맨 오른쪽 값은 위의 대각선 왼쪽에서 오는 경우만 가능
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                } else { // 나머지 값은 위의 두 경로 중 최대값을 선택
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
                }
            }
        }

        // 마지막 줄에서 최대값 찾기
        int maxSum = 0;
        for (int j = 0; j < n; j++) {
            maxSum = Math.max(maxSum, dp[n - 1][j]);
        }

        bw.write(maxSum + "");
        
        bw.flush();
        br.close();
        bw.close();
    }
}