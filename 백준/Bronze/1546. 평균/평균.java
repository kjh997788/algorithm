import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr1 = s.split(" ");
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        Arrays.sort(arr2);
        float sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (float)arr2[i] / arr2[N-1] * 100;
        }
        System.out.println(sum/N);
    }
}