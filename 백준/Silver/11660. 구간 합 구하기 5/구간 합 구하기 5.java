import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][N + 1];
        int[][] sum = new int[N + 1][N + 1]; // 누적 합 배열

        // 배열 입력 및 누적 합까지 입력
        for (int i = 1; i <= N; i++) {
            StringTokenizer stN = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(stN.nextToken());
                sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer stM = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stM.nextToken());
            int y1 = Integer.parseInt(stM.nextToken());
            int x2 = Integer.parseInt(stM.nextToken());
            int y2 = Integer.parseInt(stM.nextToken());

            int result = sum[x2][y2] - sum[x1 - 1][y2] - sum[x2][y1 - 1] + sum[x1 - 1][y1 - 1];
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}