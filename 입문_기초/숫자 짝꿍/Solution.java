import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String[] a = X.split("");
        String[] b = Y.split("");
        ArrayList<String> list = new ArrayList<>();
        int size = 10;
        int[] a_count = new int[size];
        int[] b_count = new int[size];

        for (int i = 0; i < a.length; i++) {
            a_count[Integer.parseInt(a[i])]++;
        }

        for (int i = 0; i < b.length; i++) {
            b_count[Integer.parseInt(b[i])]++;
        }

        for (int i = 0; i < size; i++) {
            if (0 < a_count[i] && 0 < b_count[i]) {
                int num = a_count[i] < b_count[i] ? a_count[i] : b_count[i];
                for (int j = 0; j < num; j++) {
                    list.add(i + "");
                }
            }
        }

        if (list.size() == 0) {
            return "-1";
        } else {
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });
            String temp = String.join("", list);
            temp = temp.replaceAll("0", "");
            if (temp.length() == 0) {
                return "0";
            } else {
                return String.join("", list);
            }
        }
    }
}