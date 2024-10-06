import java.util.Arrays;
public class TransposeMatrix {
    public static void main(String[] Args){
        int[][] matrix = {{1,2,3,10},{4,5,6,20},{7,8,9,30},{40,50,60,70}};
        int[][] output = transpose(matrix);
        for(int[] row : output){
            System.out.println(Arrays.toString(row));
        }

    }
    
    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}

