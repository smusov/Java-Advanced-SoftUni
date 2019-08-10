import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int[] rowCol = Arrays.stream(read.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        List<List<Integer>> matrix = fillMatrix(rowCol);


        String input;
        
        while(!"Nuke it from orbit".equals(input=read.readLine())){
        
            int [] elements = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

            int row = elements[0];
            int col = elements[1];
            int radius = elements[2];

            for (int r = row-radius; r <=row+radius ; r++) {
                if (checkIndex(matrix,r,col)){
                    matrix.get(r).set(col,0);
                }
            }
            for (int c = col-radius; c <=col+radius ; c++) {
                if (checkIndex(matrix,row,c)){
                    matrix.get(row).set(c,0);
                }
            }
            for (int i = 0; i < matrix.size(); i++) {
               matrix.set(i,matrix.get(i).stream().filter(e->e>0).collect(Collectors.toList()));
               if (matrix.get(i).size()==0){
                   matrix.remove(i);
                   i--;
               }
            }
        }
        printMatrix(matrix);

    }

    private static boolean checkIndex(List<List<Integer>> matrix, int row, int col) {
        return row>=0&&row<matrix.size()&&col>=0&&col<matrix.get(row).size();
    }

    private static void printMatrix(List<List<Integer>> matrix) {
        for (int row = 0; row < matrix.size(); row++) {
            for (int col = 0; col < matrix.get(row).size(); col++) {
                System.out.print(matrix.get(row).get(col)+" ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> fillMatrix(int[] rowCol) {
        List<List<Integer>> matrix = new ArrayList<>();
        int counter = 1;
        for (int i = 0; i < rowCol[0]; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < rowCol[1]; j++) {
                row.add(counter++);
            }
            matrix.add(row);
        }
        return matrix;
    }
}
