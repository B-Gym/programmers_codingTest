import java.util.*;

class Solution {
    public String solution(String polynomial) {
        ArrayList<Integer> x_arr = new ArrayList<>();
        int x_num = 0;
        int const_num = 0;

        String[] arr = polynomial.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                if (!(arr[i].matches(".*[0-9].*"))) {
                    arr[i] = arr[i].replaceAll("x", "1x");
                }
                arr[i] = arr[i].replaceAll("x", "");
                x_arr.add(Integer.parseInt(arr[i]));
            } else if (arr[i].matches(".*[0-9].*")) {
                const_num += Integer.parseInt(arr[i]);
            }
        }

        for (int i = 0; i < x_arr.size(); i++) {
            x_num += x_arr.get(i);
        }

        return (x_num == 0 || x_num == 1 ? "" : x_num) + (x_num == 0 ? "" : "x")
                + (x_num == 0 || const_num == 0 ? "" : " + ")
                + (const_num != 0 ? const_num : "");
    }
}
