import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 1000000;
        int max = -1000000;
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String arr[] = s.split(" ");
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(arr[i]);
            min = Math.min(min, p);
            max = Math.max(max, p);
        }
        System.out.println(min + " " + max);
    }
}