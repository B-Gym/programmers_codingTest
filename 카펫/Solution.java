import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // x>=y, x,y>2
        int x=0;
        int y=0;
        int width = brown + yellow;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=width; i++){
            if(width%i == 0 && i > 2){
                list.add(i);
            }
        }

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.size(); j++){
                if(list.get(i) * list.get(j) == width && i>=j && (list.get(i)*2) + ((list.get(j)-2)*2)==brown){
                    x = list.get(i);
                    y = list.get(j);
                }
            }
        }

        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}