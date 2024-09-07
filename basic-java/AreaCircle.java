import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the redious: ");
        float radius = obj.nextFloat();

        float area = (22/7)*radius*radius;
        System.out.println("Area of the circle is "+area);
        obj.close();
    }
}