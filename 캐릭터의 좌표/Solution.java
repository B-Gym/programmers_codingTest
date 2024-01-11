class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int min_x = -(board[0]/2);
        int max_x = board[0]/2;
        int min_y = -(board[1]/2);
        int max_y = board[1]/2;

        int x = 0;
        int y = 0;
        
        for(int i=0; i<keyinput.length; i++){
            switch (keyinput[i]) {
                case "left":
                    x--;
                    if(x<min_x) x++;
                    break;

                case "right":
                    x++;
                    if(x>max_x) x--;
                    break;
                
                case "up":
                    y++;
                    if(y>max_y) y--;
                    break;
                
                case "down":
                    y--;
                    if(y<min_y) y++;
                    break;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}