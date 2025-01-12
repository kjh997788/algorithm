import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            bw.write("0");
            bw.flush();
            return;
        }

        int max = 100000; // 최대 위치
        boolean[] visited = new boolean[max + 1];
        int[] time = new int[max + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(N);
        visited[N] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                if (next == K) {
                    bw.write((time[current] + 1) + "");
                    bw.flush();
                    return;
                }
                if (next >= 0 && next <= max && !visited[next]) {
                    visited[next] = true;
                    time[next] = time[current] + 1;
                    queue.add(next);
                }
            }
        }
    }
}
// 시간 복잡도: O(V+E)
// 공간 복잡도: O(V)