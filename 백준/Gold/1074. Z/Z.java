import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(recursive((int) Math.pow(2, N), r, c)));
        bw.close();
        br.close();
    }

    public static int recursive(int N, int r, int c) {
        if (N == 1) return 0;

        int mid = N / 2;
        if (r < mid && c < mid) {
            return recursive(mid, r, c);
        } else if (r < mid && c >= mid) {
            return mid * mid + recursive(mid, r, c - mid);
        } else if (r >= mid && c < mid) {
            return 2 * mid * mid + recursive(mid, r - mid, c);
        } else {
            return 3 * mid * mid + recursive(mid, r - mid, c - mid);
        }
    }
}