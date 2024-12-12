import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int coins = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (K >= arr[i]) {
                coins += K / arr[i];
                K %= arr[i];
            }

        }
        bw.write(coins + "");

        bw.flush();
        bw.close();
        br.close();
    }
}