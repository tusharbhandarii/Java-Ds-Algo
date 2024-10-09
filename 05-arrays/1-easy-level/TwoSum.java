import java.util.Arrays;

public class TwoSum {
    public static void main(String[] Args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSumCheck2(nums,target);
        System.out.println(Arrays.toString(result));
    }

    //it works for sorted as wellas unsorted array
    static int[] twoSumCheck2(int[] arr,int target){
        if(arr.length<2 || target<0) return new int[]{-1,-1};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    } 
    
    // it only works for sorted array
    static int[] twoSumCheck(int[] arr,int target){
        if(arr.length<2 || target<0) return new int[]{-1,-1};
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return new int[]{left,right};
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    } 

}
