import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] inputNM = br.readLine().split(" ");
        int H = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);

        M -= 45;

        if (M < 0) {
            M += 60;
            H -= 1;
            
            if (H < 0) {
                H = 23;
            }
        }
        bw.write(String.valueOf(H) + " " + String.valueOf(M));
        
        bw.close();
        br.close();
    }
}
