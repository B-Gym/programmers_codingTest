class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int median = total / num;

        if (num == 1) {
            answer[0] = total;
            return answer;
        } else if (num == 2) {
            answer[0] = median;
            answer[1] = median++;
        }

        if (num % 2 == 0) {
            int first = ((num - 2) / 2) == 0 ? median - 1 : median - ((num - 2) / 2);
            for (int i = 0; i < num; i++) {
                answer[i] = first++;
            }
        } else {
            int first = ((num - 1) / 2) == 0 ? median - 1 : median - ((num - 1) / 2);
            for (int i = 0; i < num; i++) {
                answer[i] = first++;
            }
        }

        return answer;
    }
}