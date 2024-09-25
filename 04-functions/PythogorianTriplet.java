import java.util.Scanner;
public class PythogorianTriplet {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = obj.nextInt();
        System.out.print("Enter number: ");
        int num2 = obj.nextInt();
        System.out.print("Enter number: ");
        int num3 = obj.nextInt();

        boolean ans = pythogorianCheck(num1, num2, num3);
        System.out.println(ans);

        obj.close();
    }

    static boolean pythogorianCheck(int n1,int n2,int n3){
        return n1*n1 + n2*n2 == n3*n3;
    }
}
