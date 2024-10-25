import java.util.Arrays;
public class RemoveDuplicatesSortedArray{
    public static void main(String[] Args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int output = removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(output);
    }
    
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;

        int key=0; // unique element
        for(int i=1; i<nums.length; i++){
            if(nums[key] != nums[i]){
                key++;
                nums[key] = nums[i];
            }
        }
        return key+1;   // The length of the array without duplicates
    }
}