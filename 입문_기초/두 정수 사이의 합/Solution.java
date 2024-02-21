class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp;

        if(a==b){
            return answer = a;
        }else if(a>b){
            temp = a;
            a = b;
            b = temp;
        }

        int count = b-a+1;

        for(int i=0; i<count; i++){
            answer += a++;
        }

        return answer;
    }
}