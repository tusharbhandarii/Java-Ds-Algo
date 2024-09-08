import java.util.Scanner;
public class Factorial{
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter non-negetive integer: ");
        int number = obj.nextInt();

        if(number<0){
        System.out.println("Number must be Non-Negetive Integer !!");
        }else{
            int factorial = 1;
            for(int i=2;i<=number;i++){
                factorial*=i;
            }
            System.out.println("Factorial of "+number+" is "+factorial);
        }

        obj.close();
    }
}