import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;

        List<Integer> realLose = new ArrayList<>();
        List<Integer> realReserved = new ArrayList<>();
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // lost 배열에서 reserve와 겹치지 않는 학생만 realLose에 추가
        for (int l : lost) {
            boolean same = false;
            for (int r : reserve) {
                if (l == r) {
                    same = true;
                    break;
                }
            }
            if (!same) realLose.add(l);
        }

        // reserve 배열에서 lost와 겹치지 않는 학생만 realReserved에 추가
        for (int r : reserve) {
            boolean same = false;
            for (int l : lost) {
                if (r == l) {
                    same = true;
                    break;
                }
            }
            if (!same) realReserved.add(r);
        }

        // 대여
        for (int i = 0; i < realLose.size(); i++) {
            int student = realLose.get(i);
            for (int j = 0; j < realReserved.size(); j++) {
                int lender = realReserved.get(j);
                if (Math.abs(student - lender) == 1) { // 절대값으로 앞뒤 학생 확인
                    realLose.set(i, -1); // 대여 완료 표시
                    realReserved.remove(j); // 대여한 학생 제거
                    break;
                }
            }
        }

        int cannotAttend = 0;
        for (int student : realLose) {
            if (student != -1) {
                cannotAttend++;
            }
        }

        return answer - cannotAttend;
    }
}
