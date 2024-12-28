import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        StringBuilder result = new StringBuilder();

        while (A.length() < B.length()) {
            A = "0" + A;
        }
        while (B.length() < A.length()) {
            B = "0" + B;
        }

        for (int i = 0; i < A.length(); i++) {
            int digitA = A.charAt(i) - '0';
            int digitB = B.charAt(i) - '0';
            result.append(digitA + digitB);
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}