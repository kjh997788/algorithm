import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());

            String input = br.readLine();
            input = input.substring(1, input.length() - 1); // 대괄호 제거
            String[] sArr = input.isEmpty() ? new String[0] : input.split(","); // 빈 배열 처리

            Deque<Integer> deque = new ArrayDeque<>();
            for (String s : sArr) {
                deque.add(Integer.parseInt(s));
            }

            boolean isReversed = false; // 뒤집기 여부 플래그
            boolean errorOccurred = false; // 에러 발생 여부 플래그

            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    isReversed = !isReversed; // 뒤집기 상태 반전
                } else if (c == 'D') {
                    if (deque.isEmpty()) { // 비어있을 경우 에러
                        bw.write("error\n");
                        errorOccurred = true;
                        break;
                    }
                    if (isReversed) {
                        deque.removeLast(); // 뒤집힌 상태에서는 마지막 값 제거
                    } else {
                        deque.removeFirst(); // 정상 상태에서는 첫 번째 값 제거
                    }
                }
            }
            if (errorOccurred) continue; // 에러 발생 시 다음 테스트 케이스로 이동

            bw.write("[");
            while (!deque.isEmpty()) {
                bw.write(isReversed ? deque.removeLast().toString() : deque.removeFirst().toString());
                if (!deque.isEmpty()) bw.write(",");
            }
            bw.write("]\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}