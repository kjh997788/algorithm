import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            bw.write("0");
            bw.close();
            br.close();
            return;
        }

        int[] difficulty = new int[n];
        for (int i = 0; i < n; i++) {
            difficulty[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(difficulty);

        int bound = (int)Math.round(n * 0.15);
        int sum = 0;
        for (int i = bound; i < n - bound; i++) {
            sum += difficulty[i];
        }
        double average = (double)sum / (n - bound * 2);
        bw.write(String.valueOf(Math.round(average)));

        bw.close();
        br.close();
    }
}