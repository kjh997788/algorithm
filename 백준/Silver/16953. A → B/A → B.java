import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        bw.write(AtoB(A, B) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    public static int AtoB(long A, long B) {
        int cnt = 0;

        while (B > A) {
            if (B % 10 == 1) { // B의 끝자리가 1인 경우
                B /= 10;
            } else if (B % 2 == 0) { // B가 2로 나누어 떨어지는 경우
                B /= 2;
            } else { // 위 두 조건이 모두 아닌 경우
                return -1;
            }
            cnt++;
        }
        // 최종적으로 A와 B가 같으면 연산 횟수 반환, 아니면 -1 반환
        return (A == B) ? cnt + 1 : -1;
    }
}