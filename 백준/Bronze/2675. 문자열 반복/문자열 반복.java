import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String arr[] = s.split(" ");
            for (int j = 0; j < arr[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(arr[0]); k++) {
                    System.out.print(arr[1].charAt(j));
                }
            }
            System.out.println();
        }
    }
}