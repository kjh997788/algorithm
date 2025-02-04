import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] ranks = new int[N];
        Arrays.fill(ranks, 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                        ranks[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(ranks[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}