import java.util.Scanner;
public class VolumeSphere {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float radius = obj.nextFloat();

        double volume = (4.0/3)*(22/7.0)*radius*radius*radius;

        System.out.print("The volume is "+volume);
        obj.close();
    }
}
