import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            while (current <= target) {
                stack.push(current++);
                result.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                result.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            bw.write(result.toString());
        } else {
            bw.write("NO");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}