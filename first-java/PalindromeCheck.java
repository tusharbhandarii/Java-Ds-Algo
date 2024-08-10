import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner obj  = new Scanner(System.in);
        System.err.print("Enter a number: ");
        int num = obj.nextInt();

        if(num>=0){
            int num2 = num;
            int ans = 0;
            while (num>0) {
                int rem = num%10;
                ans = ans*10+rem;
                num /=10;
            }
            if (ans == num2) {
                System.out.println(num2+" is a palindrome number.");
            }else{
                System.out.println(num2+" is not a palindrome number.");
            }
        }else{
            System.out.println("Please enter a valid number !!");
        }

        obj.close();
    }
}
