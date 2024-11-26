import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputNM = br.readLine().split(" ");
        int n = Integer.parseInt(inputNM[0]);
        
        bw.write(String.valueOf(n*(n+1)/2));

        bw.close();
        br.close();
    }
}