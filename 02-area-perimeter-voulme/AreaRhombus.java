import java.util.Scanner;
public class AreaRhombus {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first diagonal: ");
        float dia1 = obj.nextFloat();
        System.out.print("Enter the second diagonal: ");
        float dia2 = obj.nextFloat();

        double area = (dia1*dia2)/2;

        System.out.println("The area is "+area);
        obj.close();
    }
    
}
