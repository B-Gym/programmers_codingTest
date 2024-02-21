// class Solution {
// public String[] solution(String[] quiz) {
// String[] answer = new String[quiz.length];

// for (int i = 0; i < quiz.length; i++) {
// quiz[i] = quiz[i].replaceAll(" ", "");
// int index = quiz[i].indexOf("=");
// int result = Integer.parseInt(quiz[i].substring(index + 1,
// quiz[i].length()));

// String q = quiz[i].substring(0, index);
// String[] num = q.split("\\D+");

// q = q.replaceAll("[0-9]", "").replaceAll(" ", "");
// String[] sign = q.split("");

// int temp = Integer.parseInt(num[0]);
// for (int j = 0; j < sign.length; j++) {
// if (sign[j].equals("+")) {
// temp += Integer.parseInt(num[j + 1]);
// } else {
// temp -= Integer.parseInt(num[j + 1]);
// }
// }

// answer[i] = temp == result ? "O" : "X";
// }

// return answer;
// }
// }

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");

            int result = 0;
            if (temp[1].equals("-")) {
                result = Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            } else {
                result = Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            }

            answer[i] = Integer.parseInt(temp[4]) == result ? "O" : "X";
        }

        return answer;
    }
}