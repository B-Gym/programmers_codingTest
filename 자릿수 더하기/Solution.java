import java.util.*;

public class Solution {
    public static int solution(int n) {
        int answer = 0;

        String temp = "" + n;

        for(int i=temp.length()-1; i>-1; i--){
            answer += (int)(n/(Math.pow(10, i)));
            n = (int)(n%(Math.pow(10, i)));
        }

        return answer;
    }

    
    public static void main(String[] args){
        System.out.println(solution(987));
    }
}