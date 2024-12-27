import java.util.*;

class Solution {
    public List<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> answer = new ArrayList<>();
        
        for (int i = 0; i < data.length; i++) {
            switch (ext) {
                case "code" :
                    if (data[i][0] < val_ext) answer.add(data[i]);
                    break;
                case "date" :
                    if (data[i][1] < val_ext) answer.add(data[i]);
                    break;
                case "maximum" :
                    if (data[i][2] < val_ext) answer.add(data[i]);
                    break;
                case "remain" :
                    if (data[i][3] < val_ext) answer.add(data[i]);
                    break;
            }
        }
        
        switch (sort_by) {
            case "code" :
                answer.sort(Comparator.comparingInt(arr -> arr[0]));
                break;
            case "date" :
                answer.sort(Comparator.comparingInt(arr -> arr[1]));
                break;
            case "maximum" :
                answer.sort(Comparator.comparingInt(arr -> arr[2]));
                break;
            case "remain" :
                answer.sort(Comparator.comparingInt(arr -> arr[3]));
                break;
        }
        
        return answer;
    }
}