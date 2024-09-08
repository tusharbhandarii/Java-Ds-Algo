import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a side: ");
        float side = obj.nextFloat();

        double peri = 4*side;

        System.out.println("The perimeter is "+peri);

        obj.close();
    }
}
