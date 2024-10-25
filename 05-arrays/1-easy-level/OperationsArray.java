import java.util.Arrays;
public class OperationsArray {
    public static void main(String[] Args){
        int[] nums = {847,847,0,0,0,399,416,416,879,879,206,206,206,272};
        int[] output = applyOperations(nums);
        System.out.println(Arrays.toString(output));
    }

    public static int[] applyOperations(int[] nums) {
        int[] result = nums;
        for(int i=0; i<result.length-1; i++){
            if(result[i]==result[i+1]){
                result[i]*=2;
                result[i+1]=0;
            }
        }
        int index = 0;
        for(int i=0; i<result.length; i++){
            if(result[i] != 0){
                result[index] = result[i];
                index++;
            }
        }
        for(int i=index; i<result.length; i++){
            result[i] = 0;
        }
        return result;
    }
}
