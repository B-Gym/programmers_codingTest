class Solution { // 잘못된 입력은 주어지지 않음
    public int solution(int[][] dots) {
        int answer = 0;
        int X = dots[0][0];
        int x = dots[0][0];
        int Y = dots[0][1];
        int y = dots[0][1];
        
        for(int i=0; i<dots.length; i++){
            if(X < dots[i][0]){
                X = dots[i][0];
            }else if(x > dots[i][0]){
                x = dots[i][0];
            }

            if(Y < dots[i][1]){
                Y = dots[i][1];
            }else if(y > dots[i][1]){
                y = dots[i][1];
            }
        }

        int width = X-x;
        int height = Y-y;
        
        return answer=width*height;
    }
}