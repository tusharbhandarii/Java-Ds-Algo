import java.util.Arrays;
class FlippingImage {
    public static void main(String[] Args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] output = flipAndInvertImage(image);
        for(int[] row: output){
            System.out.println(Arrays.toString(row));
        }
        
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] result = image;      
        for(int[] row: result){
            int left = 0;
            int right = row.length-1;
            while(left<right){
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++; right--;
            }
        }
        for(int[] row : result){
            for(int i=0; i<row.length; i++){
                row[i] = (row[i]==0)?1:0;
            }
        }
        return result;
    }
}