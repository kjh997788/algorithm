import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars1 = br.readLine().toCharArray();
        char[] chars2 = br.readLine().toCharArray();

        int[][] LCS = new int[chars1.length + 1][chars2.length + 1];
        int answer = 0;

        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i-1] == chars2[j-1]) {
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                } else {
                    LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
                }
                answer = Math.max(answer, LCS[i][j]);
            }
        }

        bw.write(answer +"");

        br.close();
        bw.flush();
        bw.close();
    }
}