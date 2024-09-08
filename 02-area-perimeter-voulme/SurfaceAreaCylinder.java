import java.util.Scanner;
public class SurfaceAreaCylinder {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float radius = obj.nextFloat();
        System.out.print("Enter the height: ");
        float height = obj.nextFloat();

        double s_area = 2*(22/7.0)*radius*(radius+height);
        System.out.print("The surface area is "+s_area);
        obj.close();
    }
}
