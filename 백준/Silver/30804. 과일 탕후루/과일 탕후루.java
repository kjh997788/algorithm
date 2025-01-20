import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");
        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(input[i]);
        }

        int answer = 0;
        int start = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int end = 0; end < N; end++) {
            countMap.put(fruits[end], countMap.getOrDefault(fruits[end], 0) + 1);

            while (countMap.size() > 2) {
                int fruitAtStart = fruits[start];
                countMap.put(fruitAtStart, countMap.get(fruitAtStart) - 1);
                if (countMap.get(fruitAtStart) == 0) {
                    countMap.remove(fruitAtStart);
                }
                start++;
            }

            answer = Math.max(answer, end - start + 1);
        }

        bw.write(answer + "");

        bw.flush();
        br.close();
        bw.close();
    }
}