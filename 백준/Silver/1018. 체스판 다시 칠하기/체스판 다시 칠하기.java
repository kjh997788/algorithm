import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        char[][] BWArray = new char[N][M];
        for (int i = 0; i < N; i++) {
            BWArray[i] = br.readLine().toCharArray();
        }

        int min = 64;

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                int cnt = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (BWArray[k][l] != 'B') cnt++;
                        } else {
                            if (BWArray[k][l] != 'W') cnt++;
                        }
                    }
                }
                if (cnt < min) min = cnt;
                cnt = 0;
                for (int k = i; k < i + 8; k++) {
                    for (int l = j; l < j + 8; l++) {
                        if ((k + l) % 2 == 0) {
                            if (BWArray[k][l] != 'W') cnt++;
                        } else {
                            if (BWArray[k][l] != 'B') cnt++;
                        }
                    }
                }
                if (cnt < min) min = cnt;
            }
        }
        bw.write(String.valueOf(min));
        bw.close();
        br.close();
    }
}