import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st1.nextToken());
            int M = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            Queue<int[]> queue = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                int p = Integer.parseInt(st2.nextToken());
                queue.add(new int[]{p, i});
            }

            int order = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean hasHigherPriority = false;

                // 현재 문서보다 높은 중요도가 있는지 확인
                for (int[] document : queue) { // queue를 LinkedList<int[]>로 캐스팅하여 접근
                    if (document[0] > current[0]) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if (hasHigherPriority) {
                    // 중요도가 높은 문서가 있으면 뒤로 보냄
                    queue.add(current);
                } else {
                    order++;
                    if (current[1] == M) {
                        bw.write(order + "\n");
                        break;
                    }
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}