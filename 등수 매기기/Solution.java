class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length]; 
        double[] avg = new double[score.length];
        
        for(int i=0; i<score.length; i++){ // score 배열 내 점수의 퍙균값을 배열에 적재
            for(int j=0; j<score[0].length; j++){
                avg[i] += (double)(score[i][j] / (double)score[0].length); // 2.0으로 나누어야 함
            }
        }
        
        for(int i=0; i<avg.length; i++){ // 등수 매기는 반복문
            answer[i] = 1;
            for(int j=0; j<avg.length; j++){
                if(avg[i] < avg[j]){
                    answer[i] = answer[i] + 1;
                }
            }
        }
        
        return answer;
    }
}