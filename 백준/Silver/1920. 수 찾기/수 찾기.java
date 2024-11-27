import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        String[] arrS1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(arrS1[i]);
        }
        Arrays.sort(arrN);

        int M  = Integer.parseInt(br.readLine());
        String[] arrS2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(arrS2[i]);
            if (binarySearch(arrN, target)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.close();
        br.close();
    }

    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}