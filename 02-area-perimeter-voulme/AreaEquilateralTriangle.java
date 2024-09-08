import java.util.Scanner;
import java.lang.Math;
public class AreaEquilateralTriangle {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length of side: ");
        float side = obj.nextFloat();

        double area = (Math.sqrt(3)/4)*side*side;

        System.out.printf("Area is %.2f",area);

        obj.close();
    }
}
