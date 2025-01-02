import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static TreeSet<Integer> numbers = new TreeSet<>();
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(st.nextToken()));
        }

        arr = new int[M];
        sequence(numbers.iterator(), 0);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void sequence(Iterator<Integer> iter, int depth) throws IOException {
        if (depth == M) {
            for (int num : arr) {
                bw.write(num + " ");
            }
            bw.newLine();
            return;
        }

        Iterator<Integer> newIter = numbers.iterator();
        while (newIter.hasNext()) {
            int nextNum = newIter.next();
            arr[depth] = nextNum;
            sequence(newIter, depth + 1);
        }
    }
}
