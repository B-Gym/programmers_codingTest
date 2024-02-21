import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack st = new Stack();

        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push("" + '(');
                } else {
                    st.pop();
                }
            }

        } catch (Exception e) {
            return false;
        }

        return st.isEmpty() ? true : false;
    }
}