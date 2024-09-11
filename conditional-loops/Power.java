import java.util.Scanner;
public class Power {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = obj.nextInt();
        System.out.print("Enter the power: ");
        int power = obj.nextInt();

        if(power<0){
            System.out.println("power should be non-negetive integer !!");
        }else{
            if(power==0){
                System.out.print("The "+base+" power 0 is 1");
            }else{
                long ans =1;
                for(int i=1;i<=power;i++){
                    ans*=base;
                }
                System.out.print("The "+base+" power "+power+" is "+ans);
            }
        }

        obj.close();
    }
}
