import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a numebr: ");
        int num = obj.nextInt();

        boolean ans = primeCheck(num);
        System.out.println(ans);
        
        obj.close();
    }
    static boolean primeCheck(int num){
        if(num<2) return false;
        for(int i=2;i<num/2;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
