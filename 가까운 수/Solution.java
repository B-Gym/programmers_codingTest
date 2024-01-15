import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[][] temp = new int[array.length][2];

        for (int i = 0; i < array.length; i++) {
            temp[i][0] = Math.abs(n - array[i]);
            temp[i][1] = array[i];
        }

        Arrays.sort(temp, (o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]));

        return answer = temp[0][1];
    }
}