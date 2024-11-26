import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] coordinate = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            coordinate[i][0] = Integer.parseInt(input[0]);
            coordinate[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return Integer.compare(a[1], b[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        for (int i = 0; i < N; i++) {
            bw.write(coordinate[i][0] + " " + coordinate[i][1]);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}