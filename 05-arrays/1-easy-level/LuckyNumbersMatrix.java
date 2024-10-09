import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersMatrix {
    public static void main(String[] Args){
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> output = luckyNumbers(matrix);
        System.out.println(output);
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){

            //finding the minimun element in current row
            int rowMin = matrix[i][0];
            int numIndex = 0;
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j]<rowMin){ 
                    rowMin=matrix[i][j];
                    numIndex = j;
                }
            }

            // checking the element is maximum in current column
            boolean luckyNumCheck = true;
            for(int k=0; k<matrix.length; k++){
                if(matrix[k][numIndex]>rowMin){
                    luckyNumCheck = false;
                    break;
                }
            }
            
            if(luckyNumCheck){System.out.println(rowMin);} 
            // If the minimum is the maximum in its column, it's a lucky number
            if(luckyNumCheck){arr.add(rowMin);} 
        }
        return arr;
    }
}
