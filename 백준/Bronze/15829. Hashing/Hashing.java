import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long hash = 0;
        long power = 1;
        int MOD = 1234567891;

        for (int i = 0; i < L; i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            hash = (hash + charValue * power) % MOD;
            power = (power * 31) % MOD;
        }

        bw.write(String.valueOf(hash));
        bw.flush();
        bw.close();
        br.close();
    }
}