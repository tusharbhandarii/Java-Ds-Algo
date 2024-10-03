import java.util.Arrays;
class ShuffleTheArray {
    public static void main(String[] Args){
        int[] nums = {1,2,3,4,4,3,2,1,5,7,3,6,9,6}; 
        int n = 7;
        int[] ans = shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int ptr1 = 0;
        int ptr2 = n;
        for(int j=0,i=0; j<n; i++,j++){
            ans[i] = nums[ptr1];
            i++;
            ans[i] = nums[ptr2];
            ptr1++; ptr2++;
        }
        return ans;
    }
}