import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long result = 1;
        A = A % C;

        while (B > 0) {
            if (B % 2 == 1) {
                result = (result * A) % C;
            }
            A = (A * A) % C;
            B /= 2;
        }

        bw.write((result % C) +"");

        bw.flush();
        bw.close();
        br.close();
    }
}