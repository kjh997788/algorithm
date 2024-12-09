import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        int[] arr = new int[M];
        combination(N, M, 1, 0, arr, bw);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void combination(int N, int M, int start, int depth, int[] arr, BufferedWriter bw) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = start; i <= N; i++) {
            arr[depth] = i; // 현재 위치에 숫자 추가
            combination(N, M, i + 1, depth + 1, arr, bw); // 다음 숫자 선택
        }
    }
}