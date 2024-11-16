import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, r = 0;
        for (int i = 0; i < 5; i++) {
            a = s.nextInt();
            r += a * a;
        }
        System.out.print(r % 10);
    }
}