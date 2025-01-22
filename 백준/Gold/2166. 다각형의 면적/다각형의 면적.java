import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        long[] x = new long[N];
        long[] y = new long[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Long.parseLong(st.nextToken());
            y[i] = Long.parseLong(st.nextToken());
        }

        double area = 0;
        for (int i = 0; i < N; i++) {
            int j = (i + 1) % N; // 다음 점, 마지막 점은 첫 번째 점과 연결
            area += x[i] * y[j];
            area -= y[i] * x[j];
        }

        area = Math.abs(area) / 2.0;

        bw.write(String.format("%.1f", area)); // 출력 양식에 맞춰 소수점 첫째자리까지만 출력
        
        bw.flush();
        bw.close();
        br.close();
    }
}