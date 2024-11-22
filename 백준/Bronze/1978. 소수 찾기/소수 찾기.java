import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(arr[i]);
            boolean p = true;
            if (num < 2) continue;
            if (num == 2) {
                a++;
                continue;
            }
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    p = false;
                    break;
                }
            }
            if (p) a++;
        }
        System.out.println(a);
    }
}