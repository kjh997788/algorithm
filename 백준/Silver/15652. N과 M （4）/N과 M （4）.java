import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        arr = new int[M];
        combination(0, 1);

        bw.flush();
        bw.close();
        br.close();
    }
    public static void combination(int depth, int start) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            combination(depth + 1, i);
        }
    }
}