import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { // i= n의 약수
                count = 0;
                for (int j = 2; j <= i; j++) { // n의 약수 중에서 소수인 수 찾기
                    if (i % j == 0)
                        count++;
                }

                if (count == 1)
                    answer.add(i);
            }
        }
        return answer;
    }
}