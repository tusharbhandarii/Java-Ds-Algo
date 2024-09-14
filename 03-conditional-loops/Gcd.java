import java.util.Scanner;
public class Gcd {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int num1 = obj.nextInt();
        // for absolite value
        int absNum1 = (num1<0)? -num1 : num1;
        
        System.out.print("Enter the second numbar: ");
        int num2 = obj.nextInt();
        // for absolite value
        int absNum2 = (num2<0)? -num2 : num2;

        while(absNum1>0 && absNum2>0){
            if(absNum1>absNum2){
                absNum1%=absNum2;
            }else{
                absNum2%=absNum1;
            }
        }
        int gcd = (absNum1>absNum2)? absNum1:absNum2;

        System.out.println(gcd);
        obj.close();
    }
}
