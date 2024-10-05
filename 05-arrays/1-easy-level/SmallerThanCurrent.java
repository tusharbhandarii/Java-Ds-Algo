import java.util.Arrays;
class SmallerThanCurrent {
    public static void main(String[] Args){
        int[] nums = {8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i != j && nums[i]>nums[j]){
                    count++;
                }
            }
            result[i] = count;
        }    
        return result;
    }
}