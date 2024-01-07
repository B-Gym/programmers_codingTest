class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String x_length = "" + x;
        int temp = x;
        int sum = 0;
        
        for(int i=x_length.length()-1; i >= 0; i--){
            sum += (int)(temp/(Math.pow(10,i)));
            temp = (int)(temp%Math.pow(10,i));
        }
        
        return answer = x%sum == 0 ? true : false;
    }
}