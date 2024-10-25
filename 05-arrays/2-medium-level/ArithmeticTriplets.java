public class ArithmeticTriplets {
    public static void main(String[] Args){
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        int output = arithmeticTriplets(nums, diff);
        System.out.println(output);
    }
    
    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]<diff) continue;
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<nums.length){
                int leftDiff = nums[i]-nums[left];
                int rightDiff = nums[right]-nums[i];
                if(leftDiff == diff && rightDiff==diff){
                    count++;
                    left--; right++;
                }else if(leftDiff<diff){
                    left--;
                }else{
                    right++;
                }
            }
        }
        return count;
    }
}
