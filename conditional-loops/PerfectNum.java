import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        if(num<0){
            System.out.println("Number must be non-negative integer !!");
        }else{
            int perfectCheck = 0;
            for(int i=1;i<=num/2;i++){
                if(num%i == 0) perfectCheck+=i;
            }
            if(num==perfectCheck){
                System.out.println("Perfect numebr");
            }else{
                System.out.println("Not a perfect number");
            }
        }
        obj.close();
    }  
}