class Solution {
    public static int solution(int n) {
        int answer = 0;

        for(int i=1; i<n+1; i++){
            if(n%i == 0){
                answer += i;
                // System.out.println(i);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(5));
    }
}
