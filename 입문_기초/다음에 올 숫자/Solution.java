class Solution {
    public int solution(int[] common) {
        int answer;
        int prev = 0;
        int head = 1;
        int difference = common[1] - common[0];
        int ratio = common[0] != 0 ? common[1] / common[0] : 0;
        boolean AP;

        while (head < common.length) {
            if (common[prev] + difference == common[head]) {
                prev++;
                head++;
            } else {
                break;
            }
        }

        AP = head == common.length;
        return answer = AP ? common[common.length - 1] + difference : common[common.length - 1] * ratio;
    }
}