import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static List<Integer> list = new ArrayList<>();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        list.addAll(set);
        arr = new int[M];

        sequence(0, 0);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void sequence(int start, int depth) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        for (int i = start; i < list.size(); i++) {
            arr[depth] = list.get(i);
            sequence(i, depth + 1);
        }
    }
}