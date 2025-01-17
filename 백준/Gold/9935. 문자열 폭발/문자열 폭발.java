import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String bomb = br.readLine();
        int bombLength = bomb.length();

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            // 현재 문자를 결과에 추가
            answer.append(input.charAt(i));

            // 폭발 문자열의 길이만큼의 문자가 일치하는지 확인
            if (answer.length() >= bombLength) {
                boolean isBomb = true;
                for (int j = 0; j < bombLength; j++) {
                    if (answer.charAt(answer.length() - bombLength + j) != bomb.charAt(j)) {
                        isBomb = false;
                        break;
                    }
                }
                // 폭발 문자열과 일치하면 제거
                if (isBomb) {
                    answer.delete(answer.length() - bombLength, answer.length());
                }
            }
        }

        if (answer.length() == 0) {
            bw.write("FRULA");
        } else {
            bw.write(answer.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}