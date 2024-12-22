import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        visited = new boolean[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        dfs(bw, N, M, arr, 0);

        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(BufferedWriter bw, int N, int M, int[] arr, int depth) throws IOException {
        if (depth == M) {
            for (int num : result) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result.add(arr[i]);
                dfs(bw, N, M, arr, depth + 1);
                result.remove(result.size() - 1);
                visited[i] = false;
            }
        }
    }
}