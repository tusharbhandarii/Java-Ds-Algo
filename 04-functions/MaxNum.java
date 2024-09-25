import java.util.Scanner;
public class MaxNum {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        float num1 = obj.nextFloat();
        System.out.print("Enter number: ");
        float num2 = obj.nextFloat();
        System.out.print("Enter number: ");
        float num3 = obj.nextFloat();

        float ans = maxNumCheck(num1, num2, num3);
        System.out.println(ans);

        obj.close();
    }

    static float maxNumCheck(float x,float y,float z){
        return (x>y)? (x>z)?x:z : (y>z)?y:z ;
    }
}
