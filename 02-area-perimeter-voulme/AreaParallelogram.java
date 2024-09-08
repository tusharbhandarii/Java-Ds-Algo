import java.util.Scanner;
public class AreaParallelogram{
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = obj.nextFloat();
        System.out.print("Enter the height: ");
        float height  = obj.nextFloat();

        double area = base*height;
        System.out.println("The Area is "+area);

        obj.close();
    }
}