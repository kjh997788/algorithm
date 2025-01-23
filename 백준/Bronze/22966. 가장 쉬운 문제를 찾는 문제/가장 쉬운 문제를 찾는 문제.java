import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            treeMap.put(Integer.parseInt(arr[1]), arr[0]);
        }

        bw.write(treeMap.get(treeMap.firstKey()));

        bw.flush();
        bw.close();
        br.close();
    }
}