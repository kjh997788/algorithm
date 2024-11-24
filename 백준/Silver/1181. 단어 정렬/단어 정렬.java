import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> stringTS = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return Integer.compare(o1.length(), o2.length());
                }
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < N; i++) {
            stringTS.add(br.readLine());
        }
        for (String str : stringTS){
            System.out.println(str);
        }

    }
}