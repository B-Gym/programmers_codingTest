package 실패율;

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[][] temp = calculationFailureRate(N, stages);

        sortArr(temp, false, true);

        for (int i = 0; i < N; i++) {
            answer[i] = (int) temp[i][1];
        }

        return answer;
    }

    static double[][] calculationFailureRate(int N, int[] arr) {
        double[][] temp = new double[N][2]; // 실패율, 스테이지 번호 배열
        int deno = arr.length; // 분모

        for (int i = 0; i < N; i++) {
            temp[i][1] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (arr[i] == temp[j][1]) {
                    temp[j][0]++;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            double deno_temp = temp[i][0];
            temp[i][0] = temp[i][0] != 0 ? (temp[i][0] / deno)
                    : temp[i][0];
            deno -= deno_temp;
        }

        return temp;
    }

    public static double[][] sortArr(double[][] arr, boolean o1_asc, boolean o2_asc) {
        Arrays.sort(arr, new Comparator<double[]>() {
            public int compare(double[] o1, double[] o2) {
                if (o1[0] == o2[0]) {
                    return o2_asc ? Double.compare(o1[1], o2[1]) : Double.compare(o2[1], o1[1]);
                } else {

                    return o1_asc ? Double.compare(o1[0], o2[0]) : Double.compare(o2[0], o1[0]);
                }
            }
        });

        return arr;
    }
}