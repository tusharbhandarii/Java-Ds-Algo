import java.util.Scanner;
import java.lang.Math;
public class CompoundInterest {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter principle amount: ");
        int amount = obj.nextInt();
        System.out.print("Enter the intrest rate: ");
        int intrest_rate = obj.nextInt();
        System.out.print("Enter the time in year: ");
        int time = obj.nextInt();

        double ci = (amount*(Math.pow((1+ intrest_rate/100.0),time)))-amount;

        System.out.println("The compound intrest is "+ci);

        obj.close();
    }
}
