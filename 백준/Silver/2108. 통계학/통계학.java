import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int[] numbers = new int[N];
        int sum = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
            map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
        }

        // 1. 산술평균
        bw.write(Math.round((double) sum / N) + "\n");

        // 2. 중앙값
        Arrays.sort(numbers);
        bw.write(numbers[N / 2] + "\n");

        // 3. 최빈값
        List<Integer> list = new ArrayList<>();
        int max = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        int mode = (list.size() > 1) ? list.get(1) : list.get(0);
        bw.write(mode + "\n");

        // 4. 범위
        bw.write((numbers[N - 1] - numbers[0]) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}