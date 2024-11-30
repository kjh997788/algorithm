import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedList<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] sArr = br.readLine().split(" ");
            switch (sArr[0]) {
                case "push":
                    queue.add(Integer.parseInt(sArr[1]));
                    break;
                case "pop":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.poll() + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.peek() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.getLast() + "\n");
                    break;
            }
        }
        bw.close();
        br.close();
    }
}