import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = obj.nextInt();

        if(num%2==0){
            System.out.println(num+" is a even number.");
        }else{
            System.out.println(num+" is a odd number.");
        }
    obj.close();
    }
}