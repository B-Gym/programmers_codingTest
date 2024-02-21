package 과일장수;
import java.util.Arrays;

public class Solution {
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int box_num = score.length/m;
        int delete_apple_num = score.length%m;

        if(box_num == 0){
            return answer = 0;
        }

        Arrays.sort(score);

        int count = 0;
        for(int i=delete_apple_num; i<score.length; i++){
            count++;
            // System.out.println(score[i]);
            if(count%m ==0){
                // System.out.println("----" + count);
                answer += score[i-m+1]*m;
                // System.out.println("temp:" + temp);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        // int[] s = {1,2,3,1,2,3,1};
        // solution(3, 4, s);

        int[] s = {4,1,2,2,4,4,4,4,1,2,4,2,};
        solution(4, 3, s);
        System.out.println( solution(4, 3, s));
    }
}
