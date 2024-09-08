import java.util.Scanner;
public class SurfaceAreaCube {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a side: ");
        float side = obj.nextFloat();

        double s_area = 6*side*side;

        System.out.print("The surrface area is "+s_area);
        obj.close();
    }
}
