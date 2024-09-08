import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("How many terms?: ");
        int range = obj.nextInt();
        int ptr1=0,ptr2=1;

        if(range<0){
            System.out.println("Please enter positive number.");
        }else if(range==1){
            System.out.println(ptr1);
        }else{
            int i=0;
            do{
                System.out.println(ptr1);
                int temp = ptr1+ptr2;
                ptr1 = ptr2;
                ptr2 = temp;
                i++;
            }while(i<range);
        }
        // for(int i=1;i<=range;i++){
        //     System.err.print(ptr1+" ");
        //     int temp = ptr1+ptr2;
        //     ptr1 = ptr2;
        //     ptr2 = temp;
        // }
        
        obj.close();
    }
}
