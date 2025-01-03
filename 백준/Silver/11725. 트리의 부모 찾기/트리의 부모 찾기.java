import java.io.*;
import java.util.*;

public class Main {
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] parent;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        parent = new int[n + 1];
        visited = new boolean[n + 1];

        findParentDFS(1);

        for (int i = 2; i <= n; i++) {
            bw.write(parent[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void findParentDFS(int current) {
        visited[current] = true;
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                parent[neighbor] = current;
                findParentDFS(neighbor);
            }
        }
    }
}