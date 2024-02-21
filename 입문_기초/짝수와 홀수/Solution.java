class Solution {
    public static String solution(int num) {
        String answer = "";
        return answer = num%2==0 || num == 0?"Even":"Odd"; // 삼항연산자

    }

    public static void main(String[] args){
        System.out.println(solution(1));
    }
}