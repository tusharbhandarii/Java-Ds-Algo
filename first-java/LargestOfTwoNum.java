import java.util.Scanner;
public class LargestOfTwoNum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = obj.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = obj.nextFloat();

        if(num1>num2){
            System.out.println(num1+" is the largest number.");
        }else{
            System.out.println(num2+" is the largest number.");
        }

        obj.close();
    }
}
