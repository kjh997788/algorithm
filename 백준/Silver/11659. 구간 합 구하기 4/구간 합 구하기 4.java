import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        int[] arr = new int[N + 1];
        int[] prefixSum = new int[N + 1];

        String[] inputArr = br.readLine().split(" ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(inputArr[i - 1]);
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int m = 0; m < M; m++) {
            String[] inputIJ = br.readLine().split(" ");
            int i = Integer.parseInt(inputIJ[0]);
            int j = Integer.parseInt(inputIJ[1]);

            int sum = prefixSum[j] - prefixSum[i - 1];
            bw.write(sum + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}