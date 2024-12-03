import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] convertedArr = conversion(arr);

        while (!Arrays.equals(arr, convertedArr)) {
            arr = convertedArr.clone();
            convertedArr = conversion(convertedArr);
            answer++;
        }

        return answer;
    }
    
    public static int[] conversion(int[] arr) {
        int[] newArr = arr.clone();
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] >= 50 && (newArr[i] % 2 == 0)) newArr[i] /= 2;
            else if (newArr[i] < 50 && (newArr[i] % 2 != 0)) newArr[i] = newArr[i] * 2 + 1;
        }
        return newArr;
    }
}
