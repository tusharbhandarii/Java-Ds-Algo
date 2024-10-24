import java.util.Arrays;

class ReshapeMatrix {
    public static void main(String[] Args){
        int[][] mat = {{1,2},{3,4}};
        int r = 4;
        int c = 1;
        int[][] output = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(output));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((m*n) == (r*c)){
            int[][] result = new int[r][c];
            for(int i=0; i<m*n; i++){
                result[i/c][i%c] = mat[i/n][i%n];
            }
            return result;
        }
        return mat; 
    }
}