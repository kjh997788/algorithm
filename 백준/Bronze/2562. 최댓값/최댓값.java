import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int p = 0;
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > sum) {
                sum = n;
                p = i +1;
            }
        }
        System.out.println(sum);
        System.out.println(p);
    }
}