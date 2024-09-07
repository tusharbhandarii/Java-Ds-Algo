import java.util.Scanner;
public class AreaTriangle {
        public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        float first = obj.nextFloat();
        System.out.print("Enter the second side: ");
        float second = obj.nextFloat();
        System.out.print("Enter the third side: ");
        float third = obj.nextFloat();

        float semi_peri = (first+second+third)/2;
        double area = Math.sqrt(semi_peri*(semi_peri-first)*(semi_peri-second)*(semi_peri-third));

        System.out.printf("Area of the triangle is %.2f",area);
        obj.close();
    }
    
}
