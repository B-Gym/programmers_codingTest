import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] modulus = new int[numlist.length][2];
        

        // 이차원 배열에 numlist내 정수와 n의 절닷값과 numlist의 값을 저장
        for(int i=0; i<numlist.length; i++){
            modulus[i][0] = Math.abs(numlist[i]-n);
            modulus[i][1] = numlist[i];
        }
        
        // 절댓값을 기준으로 오름차순 정렬한 다음 절댓값이 같은 경우에 o2의 값이 더 큰 수로 내림차 정렬
         Arrays.sort(modulus, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o2[1] - o1[1]; // 내람차(o2[1]-o1[1]), 오름차(o1[1]-o2[1])
                }else{
                    return o1[0] - o2[0];
                }
            }
        });
        
        
        for(int i=0; i<answer.length; i++){
            answer[i] = modulus[i][1];
        }

        // 2차원 배열 출력문
        // System.err.println(Arrays.deepToString(modulus));

        // for (int i = 0; i < modulus.length; i++) {            
        //     int[] inArr = modulus[i];            
        //     for (int j = 0; j < inArr.length; j++) {                
        //         System.out.print(inArr[j] + " ");            
        //     }            
        //     System.out.println();        
        // }

        
        return answer;
    }
}