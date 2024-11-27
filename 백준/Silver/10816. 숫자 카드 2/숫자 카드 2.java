import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        String[] arrS1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(arrS1[i]);
        }
        Arrays.sort(arrN);

        int M = Integer.parseInt(br.readLine());
        String[] arrS2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(arrS2[i]);
            int cnt = upperRange(arrN, target) - lowerRange(arrN, target);
            bw.write(cnt + " ");
        }
        bw.close();
        br.close();
    }

    private static int upperRange(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int lowerRange(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
