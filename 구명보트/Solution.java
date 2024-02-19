class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;

        quickSort(people, 0, people.length - 1);

        int end = people.length - 1;
        int start = 0;
        while (end >= start) {
            if (people[end] + people[start] > limit) {
                end--;
                answer++;
            } else {
                end--;
                start++;
                answer++;
            }
        }

        return answer;
    }

    static void quickSort(int[] a, int l, int r) {
        int pl = l;
        int pr = r;
        int pivot = a[(pl + pr) / 2];

        do {
            while (a[pl] < pivot)
                pl++;
            while (a[pr] > pivot)
                pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (l < pr)
            quickSort(a, l, pr);
        if (r > pl)
            quickSort(a, pl, r);
    }

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}