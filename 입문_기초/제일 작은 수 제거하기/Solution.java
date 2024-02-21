import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0]; // 최솟값 담는 변수

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            answer.add(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) { // 앞부터 삭제하면 최솟값이 여러 개인 경우 index error발생하므로 뒤에서부터 탐색후 삭제
            if (min == arr[i]) {
                answer.remove(i);
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
            return answer;
        }

        return answer;
    }
}