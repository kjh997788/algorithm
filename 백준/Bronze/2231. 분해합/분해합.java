import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = Math.max(1, N - (int) (Math.log10(N) + 1) * 9); i < N; i++) {
            if (digits(i) == N) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }

    public static int digits(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}