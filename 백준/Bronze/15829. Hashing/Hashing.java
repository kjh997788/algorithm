import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        BigInteger hash = BigInteger.ZERO;
        BigInteger base = BigInteger.valueOf(31);

        for (int i = 0; i < L; i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            BigInteger power = base.pow(i);
            hash = hash.add(power.multiply(BigInteger.valueOf(charValue)));
        }

        bw.write(hash.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}