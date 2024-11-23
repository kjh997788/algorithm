import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            boolean p = true;
            for (int i = 0; i < s.length()/2; i ++) {
                if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                    p = false;
                    break;
                }
            }
            if (p) System.out.println("yes");
            else System.out.println("no");
        }
    }
}