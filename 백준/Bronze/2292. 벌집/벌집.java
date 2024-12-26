import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int room = 1;
        int range = 1;

        while (range < N) {
            range += 6 * room;
            room++;
        }

        bw.write(room + "");
        
        bw.flush();
        br.close();
        bw.close();
    }
}