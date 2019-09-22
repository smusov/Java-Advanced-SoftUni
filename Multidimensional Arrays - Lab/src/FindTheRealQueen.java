package MultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheRealQueen {
    private static int size = 8;
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            String[] input = read.readLine().split("\\s+");
            for (int j = 0; j < 8; j++) {
                board[i][j] = input[j].charAt(0);
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 'q') {

                    boolean up = up(board, i, j);
                    boolean down = down(board, i, j);
                    boolean left =  left(board, i, j);
                    boolean right = right(board, i, j);

                    boolean upAndLeftDiagonal= upAndLeftDiagonal(board, i, j);
                    boolean downAndLeftDiagonal = downAndLeftDiagonal(board,i,j);

                    boolean upAndRightDiagonal = upAndRightDiagonal(board,i,j);
                    boolean downAndRightDiagonal = downAndRightDiagonal(board, i, j);

                    if (up && down && left&& right && upAndLeftDiagonal &&upAndRightDiagonal&&downAndRightDiagonal&&downAndLeftDiagonal) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }

    }

    private static boolean downAndLeftDiagonal(char[][] board, int row, int col) {
        row++;
        col--;

        while (row<size&&col>=0){
            if (checkForQueen(board,row++,col--))return false;
        }
        return true;
    }

    private static boolean upAndRightDiagonal(char[][] board, int row, int col) {
        row--;
        col++;

        while (row>=0&&col<size){
            if (checkForQueen(board,row--,col++))return false;
        }
        return true;
    }

    private static boolean downAndRightDiagonal(char[][] board, int row, int col) {
        row++;
        col++;

        while (row < size && col < size) {
            if (checkForQueen(board, row++, col++)) return false;
        }
        return true;
    }

    private static boolean upAndLeftDiagonal(char[][] board, int row, int col) {
        row--;
        col--;

        while (row >= 0 && col >= 0) {
            if (checkForQueen(board, row--, col--)) return false;
        }
        return true;
    }

    private static boolean up(char[][] board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (checkForQueen(board, i, col)) return false;
        }
        return true;
    }

    private static boolean down(char[][] board, int row, int col) {

        for (int i = row + 1; i < size; i++) {
            if (checkForQueen(board, i, col)) return false;
        }
        return true;
    }

    private static boolean left(char[][] board, int row, int col) {
        for (int i = col - 1; i >= 0; i--) {
            if (checkForQueen(board, row, i)) return false;
        }
        return true;
    }

    private static boolean right(char[][] board, int row, int col) {
        for (int i = col + 1; i < size; i++) {
            if (checkForQueen(board, row, i)) return false;
        }
        return true;
    }

    private static boolean checkForQueen(char[][] board, int row, int col) {
        return board[row][col] == 'q';
    }
}
