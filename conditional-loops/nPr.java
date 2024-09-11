import java.util.Scanner;
public class nPr {
    static long factorial(int num){
        if(num==1 || num==0)
        return 1;
            long fact=1;
            for(int i=2;i<=num;i++){
                fact*=i;
            }
            return fact;
    }

    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = obj.nextInt();
        System.out.print("Enter the number of items being chosen: ");
        int r = obj.nextInt();

        long nPr = factorial(n)/factorial(n-r);

        System.out.print("The nPr is "+nPr);

        obj.close();
    }
}
