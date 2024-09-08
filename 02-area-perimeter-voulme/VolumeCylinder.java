import java.util.Scanner;
public class VolumeCylinder {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = obj.nextFloat();
        System.out.print("Enter the height: ");
        float height = obj.nextFloat();

        double volume = (22.0/7)*radius*radius*height;
        System.out.println("The volume is "+volume);
        obj.close();
    }
}
