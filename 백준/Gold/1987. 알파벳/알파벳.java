import java.io.*;
import java.util.*;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[] visited; // 알파벳 방문 여부를 확인하기 위한 배열
    static int answer = 0;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우 방향
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().toCharArray();
        }

        visited = new boolean[26];

        // 백트래킹
        dfs(0, 0, 1); // 시작점 (0, 0) 포함

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int x, int y, int cnt) {
        // 현재 칸의 알파벳 방문 표시
        visited[board[x][y] - 'A'] = true;
        answer = Math.max(answer, cnt);

        // 상하좌우로 이동
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < R && ny < C) { // 보드 범위 안에서만 이동 가능
                if (!visited[board[nx][ny] - 'A']) { // 알파벳 카운트 여부 확인
                    dfs(nx, ny, cnt + 1);
                }
            }
        }

        // 백트래킹: 현재 칸의 알파벳 방문 해제
        visited[board[x][y] - 'A'] = false;
    }
}