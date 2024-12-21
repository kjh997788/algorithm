import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());

            adjList.get(u - 1).add(v - 1);
            adjList.get(v - 1).add(u - 1);
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int start) {
        visited[start] = true;

        for (int n : adjList.get(start)) {
            if (!visited[n]) {
                dfs(n);
            }
        }
    }
}