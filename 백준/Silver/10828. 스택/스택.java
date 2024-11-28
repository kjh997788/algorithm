import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] sArr = br.readLine().split(" ");
            if (sArr[0].equals("push")) {
                stack.push(Integer.parseInt(sArr[1]));
            } else if (sArr[0].equals("pop")) {
                if (stack.empty()) bw.write("-1\n");
                else bw.write(stack.pop()+"\n");;
            } else if (sArr[0].equals("size")) {
                bw.write(stack.size()+"\n");
            } else if (sArr[0].equals("empty")) {
                if (stack.empty()) bw.write("1\n");
                else bw.write("0\n");
            } else {
                if (stack.empty()) bw.write("-1\n");
                else bw.write(stack.peek()+"\n");
            }
        }
        bw.close();
        br.close();
    }
}