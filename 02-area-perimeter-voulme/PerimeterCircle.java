import java.util.Scanner;
public class PerimeterCircle {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = obj.nextFloat();

        double peri = 2*(22/7)*radius;
        System.out.printf("The perimeter is %.2f",peri);

        obj.close();
    }
}
