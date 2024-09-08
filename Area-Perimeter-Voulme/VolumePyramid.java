import java.util.Scanner;
public class VolumePyramid {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the base: ");
        float base = obj.nextFloat();
        System.out.print("Enter the width: ");
        float width = obj.nextFloat();
        System.out.print("Enter the height: ");
        float height = obj.nextFloat();

        double volume = (1/3.0)*base*width*height;

        System.out.println("The volume is "+volume);
        obj.close();
    }
}
