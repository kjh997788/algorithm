import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int fiveCnt = 0;

        for (int i = 5; i <= n; i *= 5) {
            fiveCnt += n / i;
        }

        bw.write(String.valueOf(fiveCnt));
        bw.close();
        br.close();
    }
}