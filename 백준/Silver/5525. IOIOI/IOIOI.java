import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0; // PN의 갯수 변수
        int patternCount = 0; // IOI 패턴이 연속으로 나오는 횟수

        for (int i = 1; i < M - 1; i++) {
            // "IOI" 패턴이 발견되면
            if (S.charAt(i - 1) == 'I' && S.charAt(i) == 'O' && S.charAt(i + 1) == 'I') {
                patternCount++;
                if (patternCount == N) {
                    count++; // PN 발견
                    patternCount--; // 연속 IOI에서 맨 앞을 제거
                }
                i++; // IOI에서 OI 다음 인덱스로 이동
            } else { // 연속 패턴이 끊어지면 초기화
                patternCount = 0;
            }
        }

        bw.write(String.valueOf(count)); // 결과 출력
        bw.flush();

        br.close();
        bw.close();
    }
}