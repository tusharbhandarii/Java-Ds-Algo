import java.util.Scanner;
import java.lang.Math;

public class AreaIsosceles {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the one of the same side: ");
        float s_side = obj.nextFloat();
        System.out.print("Enter the odd side: ");
        float o_side = obj.nextFloat();
        
        double area = (o_side/2)*Math.sqrt((s_side*s_side)-(o_side*o_side)/4);
        System.out.printf("The area of the isosceles is %.2f",area);

        obj.close();
    }
}
