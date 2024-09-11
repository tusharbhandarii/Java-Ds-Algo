import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = obj.nextInt();

        if(number<0){
            System.out.println("Please enter a non-negative positive number !!");
        }else{
            int temp = number;
            int ans = 0;
            while(temp>0){
                int rem = temp%10;
                ans +=(rem*rem*rem);
                temp/=10;
            }
            if(ans==number){
                System.out.println(number+" is a Armstrong number.");
            }else{
                System.out.println(number+" is not a Armstrong number.");
            }
        }

        obj.close();
    }
}
