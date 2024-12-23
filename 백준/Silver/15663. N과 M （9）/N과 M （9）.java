import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        dfs(new ArrayList<>(), new boolean[N]);

        bw.flush();
        br.close();
        bw.close();
    }

    static void dfs(List<Integer> path, boolean[] visited) throws IOException {
        if (path.size() == M) {
            for (int num : path) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        int last = -1; // 마지막으로 사용한 값 저장
        for (int i = 0; i < N; i++) {
            if (!visited[i] && arr[i] != last) { // 중복 방지 조건
                visited[i] = true;
                path.add(arr[i]);
                dfs(path, visited);
                path.remove(path.size() - 1);
                visited[i] = false;
                last = arr[i]; // 현재 값을 마지막으로 사용한 값으로 갱신
            }
        }
    }
}