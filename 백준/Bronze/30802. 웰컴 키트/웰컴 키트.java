import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int a = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        String[] arr1 = s1.split(" ");
        String s2 = br.readLine();
        String[] arr2 = s2.split(" ");
        for (int i = 0; i < 6; i++) {
            if (Integer.parseInt(arr1[i]) != 0) {
                if (Integer.parseInt(arr1[i]) % Integer.parseInt(arr2[0]) != 0) {
                    a += (Integer.parseInt(arr1[i])/Integer.parseInt(arr2[0]) +1);
                } else {
                    a += Integer.parseInt(arr1[i])/Integer.parseInt(arr2[0]);
                }
            }
        }
        System.out.println(a);
        System.out.print(n/Integer.parseInt(arr2[1]) + " " + n%Integer.parseInt(arr2[1]));
    }
}