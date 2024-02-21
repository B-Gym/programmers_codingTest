import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        quickSort(lost, 0, lost.length - 1);
        quickSort(reserve, 0, reserve.length - 1);

        ArrayList<Integer> lost_list = new ArrayList<>();
        ArrayList<Integer> reserve_list = new ArrayList<>();
        ArrayList<Integer> kyo = new ArrayList<>();

        for (int num : lost)
            lost_list.add(num);
        for (int num : reserve)
            reserve_list.add(num);

        kyo.addAll(lost_list);
        kyo.retainAll(reserve_list);

        lost_list.removeAll(kyo);
        reserve_list.removeAll(kyo);

        int answer = n - lost_list.size();

        // System.out.println(lost_list);
        // System.out.println(reserve_list);

        int lp = 0;
        int rp = 0;
        int temp = 0;
        boolean isEnd = false;
        while (rp < reserve_list.size() && lp < lost_list.size()) {
            isEnd = rp == reserve_list.size() - 1 ? true : false;
            if (lost_list.get(lp) == reserve_list.get(rp) || lost_list.get(lp) - 1 == reserve_list.get(rp)
                    || lost_list.get(lp) + 1 == reserve_list.get(rp)) {
                lp++;
                rp++;
                temp = rp;
                answer++;
            } else {
                if (isEnd) {
                    lp++;
                    rp = temp;
                } else {
                    rp++;
                }
            }
        }

        return answer;
    }

    static void quickSort(int[] a, int l, int r) {
        int pl = l;
        int pr = r;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x)
                pl++;
            while (a[pr] > x)
                pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (pl < r)
            quickSort(a, pl, r);
        if (pr > l)
            quickSort(a, l, pr);
    }

    static void swap(int[] a, int i1, int i2) {
        int t = a[i1];
        a[i1] = a[i2];
        a[i2] = t;
    }
}