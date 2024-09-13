import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = obj.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.print(year+" is a leap year.");
        }else{
            System.out.print(year+" is not a leap year.");
        }

        obj.close();
    }
}
