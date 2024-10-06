import java.lang.Math;
public class EvenNumberDigits {
    public static void main(String[] Args){
        int[] nums = {12,345,2,6,7896};
        int output = findNumbers2(nums);
        System.out.println(output);
        // findNumbers(nums);
    }
    public static int findNumbers2(int[] nums) {
        int totalCount = 0;
        for(int i=0; i<nums.length; i++){
            if(((int)(Math.log10(nums[i])+1)) %2== 0){
                totalCount++;
            }
        }
        return totalCount;
    }
    public static int findNumbers(int[] nums) {
        int totalCount = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int count = 0;
            while(num>0){
                num/=10;
                count++;
            }
            if(count%2 == 0){
                totalCount++;
            }
        }
        return totalCount;
    }
    
}
