import java.util.Scanner;
public class ArmstrongBtwnTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int startNum = obj.nextInt();
        System.out.print("Enter the ending range: ");
        int endtNum = obj.nextInt();

        for(int i=startNum;i<endtNum;i++){ 
            int num = i;
            int ans = 0;
            while (num>0) {
                int rem = num%10;
                ans = ans+(rem*rem*rem);
                num/=10;
            }
            if(ans == i){
                System.out.println(i);
            }
        }
        obj.close();
    }
}
