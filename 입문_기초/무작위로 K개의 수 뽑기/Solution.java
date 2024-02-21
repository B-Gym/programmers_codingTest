import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];

        arr = Arrays.stream(arr).distinct().toArray();

        for(int i=0; i<answer.length; i++){
            if (i >= arr.length) {
                answer[i] = -1;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}