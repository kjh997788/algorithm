import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Member> members = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members.add(new Member(age, name, i));
        }

        Collections.sort(members, (m1, m2) -> {
            if (m1.age == m2.age) {
                return Integer.compare(m1.order, m2.order); // 가입 순으로 정렬
            }
            return Integer.compare(m1.age, m2.age); // 나이순 정렬
        });

        for (Member member : members) {
            bw.write(member.age + " " + member.name + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static class Member {
        int age;
        String name;
        int order;

        public Member(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }
}
