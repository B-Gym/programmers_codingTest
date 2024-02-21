class Solution {
    public int solution(int[][] dots) {
        double[][] temp = new double[3][2];

        // 두 개의 점을 잇는 경우의 수
        // 1
        temp[0][0] = (dots[0][1] - dots[1][1]) / (double) (dots[0][0] - dots[1][0]);
        temp[0][1] = (dots[2][1] - dots[3][1]) / (double) (dots[2][0] - dots[3][0]);

        // 2
        temp[1][0] = (dots[0][1] - dots[2][1]) / (double) (dots[0][0] - dots[2][0]);
        temp[1][1] = (dots[1][1] - dots[3][1]) / (double) (dots[1][0] - dots[3][0]);

        // 3
        temp[2][0] = (dots[0][1] - dots[3][1]) / (double) (dots[0][0] - dots[3][0]);
        temp[2][1] = (dots[1][1] - dots[2][1]) / (double) (dots[1][0] - dots[2][0]);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i][0] == temp[i][1])
                return 1;
        }

        return 0;
    }
}