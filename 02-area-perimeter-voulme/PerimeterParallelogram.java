import java.util.Scanner;
public class PerimeterParallelogram {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length: ");
        float length = obj.nextFloat();
        System.out.print("Enter the width: ");
        float width = obj.nextFloat();

        double peri = 2*(length+width);
        System.out.print("The perimeter is "+peri);
        obj.close();
    }
}
