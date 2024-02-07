import java.util.*;
import java.text.*;

class Solution {
    public ArrayList<Integer> solution(String today, String[] t, String[] p) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        String p_terms = "";
        String date = "";
        int index = 0;
        String t_terms = "";
        int period = 0;

        for (int i = 0; i < p.length; i++) {
            index = p[i].indexOf(" ");
            date = p[i].substring(0, index);
            p_terms = p[i].substring(index + 1);

            for (int j = 0; j < t.length; j++) {
                index = t[j].indexOf(" ");
                t_terms = t[j].substring(0, index);
                period = Integer.valueOf(t[j].substring(index + 1));

                if (p_terms.equals(t_terms)) {
                    if (compareDate(today, calcDate(date, 0, period, -1))) {
                        list.add(i + 1);
                    }
                    // System.out.println("today: " + today + " i: " + (i + 1));
                    // System.out.println("폐기 날짜" + calcDate(date, 0, period, -1));
                }
            }
        }
        return list;
    }

    static String calcDate(String strDate, int y, int m, int d) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

        Calendar cal = Calendar.getInstance();

        Date dt = dateFormat.parse(strDate);

        cal.setTime(dt);

        cal.add(Calendar.YEAR, y);
        cal.add(Calendar.MONTH, m);
        cal.add(Calendar.DATE, d);

        if (cal.get(Calendar.DATE) > 28) {
            cal.set(Calendar.DATE, 28);
        }

        return dateFormat.format(cal.getTime());
    }

    static boolean compareDate(String d1, String d2) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date1 = dateFormat.parse(d1);
        Date date2 = dateFormat.parse(d2);

        // date1 > date2 인 경우 true
        return date1.after(date2);
    }

}