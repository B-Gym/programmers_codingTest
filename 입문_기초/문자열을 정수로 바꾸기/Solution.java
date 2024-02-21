class Solution {
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer+30;
    }

    public static void main(String[] args){
        System.out.println(solution("-24"));
    }
}