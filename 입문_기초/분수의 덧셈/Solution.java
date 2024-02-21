class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int denom_temp = denom1;
        int numer_temp = numer1;

        int numer_result = 0;
        int denom_result = 0;

        if (denom1 > denom2) { // denom1은 항상 denom2보다 작도록 설정
            denom1 = denom2;
            denom2 = denom_temp;
            numer1 = numer2;
            numer2 = numer_temp;
        }

        if (denom2 % denom1 == 0) {
            numer1 *= denom2 / denom1;
            numer_result = numer1 + numer2;

            denom1 = denom2;
            denom_result = denom2;
        } else {
            numer1 *= denom2;
            numer2 *= denom1;
            numer_result = numer1 + numer2;

            denom1 *= denom2;
            denom2 = denom1;
            denom_result = denom2;
        }

        if (numer_result % denom_result == 0) {
            while (denom_result != 1) {
                numer_result /= denom_result;
                denom_result /= denom_result;
            }
        } else if (denom_result % numer_result == 0) {
            while (numer_result != 1) {
                denom_result /= numer_result;
                numer_result /= numer_result;
            }
        }

        int max = Math.max(numer_result, denom_result);
        for (int i = 2; i <= max; i++) {
            if (numer_result % i == 0 && denom_result % i == 0) {
                numer_result /= i;
                denom_result /= i;
            }
        }

        answer[0] = numer_result;
        answer[1] = denom_result;

        return answer;
    }
}