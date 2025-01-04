import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] RGBCosts = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            RGBCosts[i][0] = Integer.parseInt(st.nextToken()); 
            RGBCosts[i][1] = Integer.parseInt(st.nextToken()); 
            RGBCosts[i][2] = Integer.parseInt(st.nextToken());
        }

        dp[0][0] = RGBCosts[0][0];
        dp[0][1] = RGBCosts[0][1];
        dp[0][2] = RGBCosts[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = RGBCosts[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = RGBCosts[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = RGBCosts[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }
        
        int result = Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2]));

        bw.write(result +"");
        
        bw.flush();
        bw.close();
        br.close();
    }
}