import java.util.Scanner;
public class Lcm {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num01 = obj.nextInt();
        int num1 = (num01<0)? -num01:num01;  // absolute value
        
        System.out.print("Enter number: ");
        int num02 = obj.nextInt();
        int num2 = (num02<0) ? num02:num02;  // absolute value

        while(num1>0 && num2>0){
            if(num1>num2){
                num1 %=num2;
            }else{
                num2 %= num1;
            }
        } int gcd = (num1==0)? num2:num1;

        int lcm = (num01*num02)/gcd;

        System.out.println(lcm);
        obj.close();
    }  
}
