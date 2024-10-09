import java.util.Arrays;

class ArraySumZero {
    public static void main(String[] Args){
        int inputNum = 1;
        int[] output = sumZero(inputNum);
        System.out.println(Arrays.toString(output));
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2==0){
            int i=1;
            while(i<=n){
                arr[i-1] = i;
                arr[i] = -i;
                i+=2;
            }
        }else{
            int i=1;
            while(i<n){
                arr[i-1] = i;
                arr[i] = -i;
                i+=2;
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}