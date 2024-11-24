import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int bc = 1;

        for (int i = 1; i <= K; i++) {
            bc = bc * (N+1-i) / i;
        }
        System.out.print(bc);
    }
}