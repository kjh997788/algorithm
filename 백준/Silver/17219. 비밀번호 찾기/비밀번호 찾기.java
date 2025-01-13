import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> passwordMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String password = st.nextToken();
            passwordMap.put(site, password);
        }
        
        for (int i = 0; i < M; i++) {
            String site = br.readLine();
            bw.write(passwordMap.get(site) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}