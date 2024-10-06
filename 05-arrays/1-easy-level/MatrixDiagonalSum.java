public class MatrixDiagonalSum {
    public static void main(String[] Args){
        int[][] mat = { {1,1,1},
                        {1,1,1},
                        {1,1,1} };
        int output = diagonalSum(mat);
        System.out.println(output);
    }
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        for(int j=mat.length-1,i=0; i<mat.length; i++,j--){
            if( i != j ){
                result+= mat[i][i] + mat[i][j];
            }else{
                result+= mat[i][i];
            }
        }return result;
    }
}
