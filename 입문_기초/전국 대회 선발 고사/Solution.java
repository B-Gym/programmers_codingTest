import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int true_count = 0;

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                true_count++;
        }

        int[][] table = new int[true_count][2];

        int j = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                table[j][0] = rank[i];
                table[j][1] = i;
                j++;
            }
        }

        Arrays.sort(table, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });

        return answer = table[0][1] * 10000 + table[1][1] * 100 + table[2][1];
    }
}