import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {
    public static void main(String[] Args){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> output = threeSum(nums);
        System.out.println(output);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.err.println(Arrays.toString(nums));
        for(int i=0; i<nums.length-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                        result.add(temp);   // result.add(Arrays.asList(nums[i], nums[left], nums[right]))
                    // avoding duplicates
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;

                        left++; right--;
                }else if(sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
