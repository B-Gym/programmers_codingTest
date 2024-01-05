class Solution {
    public int solution(long num) {
        int answer = 0;
        if(num == 1) answer = 0;

        int count = 0;

        while(num > 1){
            if(num%2 == 0){
                num /= 2;
                count++; 
            }else{
                num = num*3 +1;
                count++; 
            }  
            if(count > 500){
                return -1;
            }
        }

        return answer = count;
    }
}