import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int[] arr2 = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])};
            Arrays.sort(arr2);
            if (arr2[0] == 0 && arr2[1] == 0 && arr2[2] == 0) {
                break;
            } else if (arr2[0]*arr2[0] + arr2[1]*arr2[1] == arr2[2]*arr2[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}