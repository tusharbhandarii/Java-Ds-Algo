import java.util.Arrays;
public class TargetArray {
    public static void main(String[] Args){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] output = createTargetArray(nums,index);
        System.out.println(Arrays.toString(output));
    }

    static int[] createTargetArray(int[] arr,int[] index){
        int[] result = new int[arr.length];
        Arrays.fill(result,-1);
        for(int i=0; i<arr.length; i++){
            if(result[index[i]] == -1){
                result[index[i]] = arr[i];
            }else{
                for(int j=arr.length-1; j>index[i]; j--){
                    result[j] = result[j-1];
                }
                result[index[i]] = arr[i];
            }
        }
        return result;
    } 

}
