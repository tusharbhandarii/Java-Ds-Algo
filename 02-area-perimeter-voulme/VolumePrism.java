import java.util.Scanner;
public class VolumePrism {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the base edge: ");
        float base = obj.nextFloat();
        System.out.print("Enter the height: ");
        float height = obj.nextFloat();
        System.out.print("Enter the length: ");
        float length = obj.nextFloat();

        double volume = (1.0/2)* base* height* length;

        System.out.println("The volume is "+volume);
        obj.close();
    }
}
