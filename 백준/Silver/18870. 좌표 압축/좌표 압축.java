import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        Map<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sortedArr[i] = arr[i];
        }

        Arrays.sort(sortedArr);
        int cnt = 0;
        for (int num : sortedArr) {
            if (!map.containsKey(num)) {
                map.put(num, cnt++);
            }
        }

        for (int num : arr) {
            bw.write(map.get(num) + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}