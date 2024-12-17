import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max) max = trees[i];
        }

        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            long total = getWood(trees, mid);

            if (total >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    public static long getWood(int[] trees, int H) {
        long total = 0;
        for (int tree : trees) {
            if (tree > H) {
                total += (tree - H);
            }
        }
        return total;
    }
}