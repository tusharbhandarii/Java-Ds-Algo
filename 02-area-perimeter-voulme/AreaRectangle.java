import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the height: ");
        float height = obj.nextFloat();
        System.out.print("Enter the width: ");
        float width = obj.nextFloat();

        float area = height*width;
        System.out.println("The area of the Rectangle is "+area);
        obj.close();
    }
}
