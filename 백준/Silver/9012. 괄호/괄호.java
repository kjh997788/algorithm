import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            char[] arrS = br.readLine().toCharArray();
            if (isVPS(arrS)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.close();
        br.close();
    }

    public static boolean isVPS(char[] arrS) {
        Stack<Character> stack = new Stack<>();
        for (char c : arrS) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}