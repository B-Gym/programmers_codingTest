package 안전지대;

class Solution {
    public int solution(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (i < board.length - 1) {
                        if (j > 0) {
                            board[i + 1][j - 1] = board[i + 1][j - 1] != 1 ? 2 : 1;
                        }
                        board[i + 1][j] = board[i + 1][j] != 1 ? 2 : 1;
                        if (j < board[i + 1].length - 1) {
                            board[i + 1][j + 1] = board[i + 1][j + 1] != 1 ? 2 : 1;
                        }
                    }

                    if (j > 0) {
                        board[i][j - 1] = board[i][j - 1] != 1 ? 2 : 1;
                    }
                    if (j < board[i].length - 1) {
                        board[i][j + 1] = board[i][j + 1] != 1 ? 2 : 1;
                    }

                    if (i > 0) {
                        if (j > 0) {
                            board[i - 1][j - 1] = board[i - 1][j - 1] != 1 ? 2 : 1;
                        }
                        board[i - 1][j] = board[i - 1][j] != 1 ? 2 : 1;
                        if (j < board[i - 1].length - 1) {
                            board[i - 1][j + 1] = board[i - 1][j + 1] != 1 ? 2 : 1;
                        }
                    }
                }
            }
        }
        return safeSpace(board);
    }

    public static int safeSpace(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0)
                    count++;
            }
        }
        return count;
    }
}
