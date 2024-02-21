class Solution {
    public int solution(int a, int b) {
        int max = Math.max(a, b);

        if (a == b) {
            return 1;
        }

        // 약분
        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }

        if (a == b || b == 1 || b == 2 || b == 5) { // 정수인 경우
            return 1;
        }

        int temp = b;

        while (temp % 2 == 0 || temp % 5 == 0) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else if (temp % 5 == 0) {
                temp /= 5;
            }
        }

        return temp == 1 ? 1 : 2;
    }
}