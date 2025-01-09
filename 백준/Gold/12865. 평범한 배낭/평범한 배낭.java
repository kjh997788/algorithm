import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][2];
        int[][] dp = new int[N + 1][K + 1]; // dp[i][j] = i번째 물건까지 고려했을 때, 무게 제한 j에서의 최대 가치

        for (int i = 1; i <= N; i++) { // 입력과 계산을 한번에 - 성능차이는 미미
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st2.nextToken());
            arr[i][1] = Integer.parseInt(st2.nextToken());

            for (int j = 1; j <= K; j++) { // j: 현재 배낭의 무게 제한
                if (arr[i][0] <= j) { // 현재 물건을 배낭에 담을 수 있는 경우
                    // 물건을 담지 않는 경우(dp[i-1][j])와 담는 경우(dp[i-1][j-arr[i][0]] + arr[i][1]) 중 최대값 선택
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i][0]] + arr[i][1]);
                } else {  // 현재 물건을 배낭에 담을 수 없는 경우
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        bw.write(dp[N][K] + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
// 시간 복잡도: O(N * K)
// 공간 복잡도: O(N * K)
// 1차원 배열로 최적화시 공간 복잡도: O(K)