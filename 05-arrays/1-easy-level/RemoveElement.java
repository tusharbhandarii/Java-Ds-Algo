import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] Args){
        int[] nums = {2,3,3,2};
        int val = 3;
        int output = removeElement(nums,val);
        System.out.println(output);
        // removeElement(nums,val);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
