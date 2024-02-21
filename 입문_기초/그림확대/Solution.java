class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int index = 0;
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                answer[index] = enlargeStr(picture[i], k);
                index++;
            }
        }

        return answer;
    }

    public static String enlargeStr(String str, int k) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += ("" + str.charAt(i)).repeat(k);
        }
        return result;
    }
}