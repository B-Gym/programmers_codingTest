

public class Solution {
    public static int solution(String[] babbling) {
        int answer = 0;

        for(int i=0; i<babbling.length; i++){
             babbling[i] = babbling[i].replaceAll("aya", " ").replaceAll("ye", " ").replaceAll("woo", " ").replaceAll("ma", " ").replaceAll(" ", "");
        }

         for(int i=0; i<babbling.length; i++){
            System.out.println(": "+ babbling[i]);
            if(babbling[i].equals("")){
                answer++;
            }
         }

        return answer;
    }
    
    public static void main(String[] args){

        // String[] s = {"ayaye", "uuuma", "ye", "yemawoo"};
        String[] s = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(solution(s));

    }
}
