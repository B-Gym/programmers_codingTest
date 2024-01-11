class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numArr = s.split(" ");

        int max = Integer.parseInt(numArr[0]);
        int min = Integer.parseInt(numArr[0]);

        for(int i=0; i<numArr.length; i++){
            if(max < Integer.parseInt(numArr[i])) max = Integer.parseInt(numArr[i]);
            if(min > Integer.parseInt(numArr[i])) min = Integer.parseInt(numArr[i]);
        }

        return answer = min + " " + max;
    }
}