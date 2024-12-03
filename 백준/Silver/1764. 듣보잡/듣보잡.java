import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> noHearSet = new HashSet<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            noHearSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (noHearSet.contains(name)) { // 중복 확인
                stringArrayList.add(name);
            }
        }
        Collections.sort(stringArrayList);

        bw.write(stringArrayList.size() + "\n");
        for (String s : stringArrayList) {
            bw.write(s + "\n");
        }

        bw.close();
        br.close();
    }
}