import java.util.Scanner;
public class AvgNum {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        int numCount = 0;
        int total = 0;
        int avgNum = 0;
        while(true){
            System.out.print("Enter Non-Negetive Integer [0 for end]: ");
            int num = obj.nextInt();
            if(num == 0){
                break; 
            }else if(num<1){
                System.out.println("Please enter non-negetive integer !!");
                continue;
            }else{
                total+=num; 
                numCount++;
            }
            avgNum = total/numCount;
        }
        System.out.print("Average is "+avgNum);
        obj.close();
    }
}
