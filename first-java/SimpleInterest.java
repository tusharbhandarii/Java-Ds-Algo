import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        int p = obj.nextInt();
        System.out.print("Enter the interest rate: ");
        int r = obj.nextInt();
        System.out.print("Enter the time(duration in year): ");
        int t = obj.nextInt();

        float si = (p*r*t)/100;

        System.out.println("The simple interest rate is "+si);

        obj.close();
    }
}
