import java.util.Scanner;
public class nCr {
    static long factorial(int num){
        if(num==0 || num==1)
        return 1;
            long fact = 1;
            for(int i=2;i<=num;i++){
                fact*=i;
            }
            return fact;
        }
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the total no of items: ");
        int n = obj.nextInt();
        System.out.print("Enter the selected item: ");
        int r = obj.nextInt();

        long nCr = factorial(n)/(factorial(r)*factorial(n-r));

        System.out.println("The nCr is "+nCr);

        obj.close();
    }
}
