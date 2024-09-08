import java.util.Scanner;
public class PerimeterEquilateralTriangle {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter any length of a side: ");
        float side = obj.nextFloat();

        double peri = 3*side;

        System.out.println("The perimeter is "+peri);
        obj.close();  
    }
}
