import java.util.Scanner;
public class SumNaturalNumber {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = obj.nextInt();

        long ans = sumNaturalNumber(range);
        System.out.println(ans);

        obj.close();
    }

    static long sumNaturalNumber(int range){
        long sum = 0;
        for(int i=1;i<=range;i++){
            sum+=i;
        }
        return sum;
    }
}


