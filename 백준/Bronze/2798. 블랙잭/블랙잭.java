import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String[] arr1 = s1.split(" ");
        int N = Integer.parseInt(arr1[0]);
        int M = Integer.parseInt(arr1[1]);

        String s2 = br.readLine();
        String[] arr2 = s2.split(" ");
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(arr2[i]);
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum <= M && answer <= sum) {
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}