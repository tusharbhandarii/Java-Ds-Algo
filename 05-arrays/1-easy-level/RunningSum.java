import java.util.Arrays;
class RunningSum {
    public static void main(String[] Args){
        int[] nums = {1,1,1,1,1};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int prev = 0;
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[i]+prev;
            prev = ans[i];
        }
        return ans;
    }
}