import java.util.ArrayList;

class Solution {
    public int solution(String A, String B) {
        ArrayList<Character> A_arr = new ArrayList<>();
        ArrayList<Character> B_arr = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < A.length(); i++) {
            A_arr.add(A.charAt(i));
            B_arr.add(B.charAt(i));
        }

        for (int i = 0; i < A.length(); i++) {
            if (A_arr.equals(B_arr)) {
                return count;
            }
            char last = A_arr.get(A_arr.size() - 1);
            A_arr.remove(A_arr.size() - 1);
            A_arr.add(0, last);
            count++;
        }

        return -1;

        // return (B+B).indexOf(A);
    }
}