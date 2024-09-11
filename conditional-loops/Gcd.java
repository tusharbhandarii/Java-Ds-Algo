import java.util.Scanner;
public class Gcd {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("enter the first number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter the second numbar: ");
        int num2 = obj.nextInt();

        while(num1>0 && num2>0){
            if(num1>num2){
                num1%=num2;
            }else{
                num2%=num1;
            }
        }
        int gcd = (num1>num2)? num1:num2;

        System.out.println(gcd);
        obj.close();
    }
}
