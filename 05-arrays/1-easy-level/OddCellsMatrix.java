import java.util.Arrays;
class OddCellsMatrix {
    public static void main(String[] Args){
        int row = 2;
        int col = 3;
        int[][] indices = {{0,1},{1,1}};
        int output = oddCells(row,col,indices);
        System.out.println(output); 
    }
    
    static int oddCells(int m, int n, int[][] indices) {
        int[][] result = new int[m][n];
        // Fill the 2D array with 0
        for (int i = 0; i < m; i++) {
            Arrays.fill(result[i], 0); // Fill each row with 0
        }

        // increment value
        for(int[] row : indices){
            int r = row[0];
            int c = row[1];
            for(int i=0; i<n; i++){
                result[r][i] +=1;
            }
            for(int j=0; j<m; j++){
                result[j][c] +=1;
            }
        }
        // counting odd numbers
        int count = 0;
        for(int[] row : result){
            for(int num : row){
                if(num%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}