import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> {
                    int absA = Math.abs(a);
                    int absB = Math.abs(b);

                    if (absA == absB) {
                        return a - b;
                    }
                    return absA - absB;
                }
        );
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (minHeap.isEmpty()) bw.write("0\n");
                else bw.write(minHeap.poll() + "\n");
            } else {
                minHeap.add(x);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}