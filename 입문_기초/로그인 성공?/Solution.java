class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(int i=0; i<db.length; i++){
            if(id.equals(db[i][0])){
                return answer = pw.equals(db[i][1]) ? "login" : "wrong pw";
            }else{
                answer = "fail";
            }
        }
        return answer;
    }
}