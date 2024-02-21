class Solution {
    public int solution(int n) {        
        int answer = (int) Math.pow((int)Math.sqrt(n), 2) == n ? 1 : 2;
        return answer;
    }
}