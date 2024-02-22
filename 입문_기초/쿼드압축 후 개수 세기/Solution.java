class Solution {
    static int zeroCnt = 0;
    static int oneCnt = 0;

    public int[] solution(int[][] arr) {
        compressQuad(arr);
        return new int[] { zeroCnt, oneCnt };
    }

    public static void compressQuad(int[][] arr) {
        boolean flag = true;
        for (int i = 0; i < arr.length && flag == true; i++) {
            for (int j = 0; j < arr[i].length - 1 && flag == true; j++) {
                if (arr[i][j] != arr[i][j + 1] || arr[j][i] != arr[j + 1][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag || arr.length == 1) {
            if (arr[0][0] == 0)
                zeroCnt++;
            else
                oneCnt++;
        } else {
            // compressQuad(copyArr(arr, 1));
            // compressQuad(copyArr(arr, 2));
            // compressQuad(copyArr(arr, 3));
            // compressQuad(copyArr(arr, 4));

            int[][] temp = new int[arr.length / 2][arr.length / 2];
            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[i][j] = arr[i][j];
                }
            }
            compressQuad(temp);

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[i][j] = arr[i][j + temp.length];
                }
            }
            compressQuad(temp);

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[i][j] = arr[i + temp.length][j];
                }
            }
            compressQuad(temp);

            for (int i = 0; i < temp.length; i++) {
                for (int j = 0; j < temp.length; j++) {
                    temp[i][j] = arr[i + temp.length][j + temp.length];
                }
            }
            compressQuad(temp);
        }
    }

    public static int[][] copyArr(int[][] arr, int quadrant) {
        int[][] temp = new int[arr.length / 2][arr.length / 2];
        int row = quadrant == 1 || quadrant == 2 ? 0 : temp.length;
        int col = quadrant == 2 || quadrant == 3 ? 0 : temp.length;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                temp[i][j] = arr[i + row][j + col];
            }
        }

        return temp;
    }
}