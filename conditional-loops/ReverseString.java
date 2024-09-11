import java.util.Scanner;
public class ReverseString {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = obj.next();

        String reverseStr = "";
        for(int i=str.length();i>0;i--){
            reverseStr += str.charAt(i-1);
        }

        System.out.print(reverseStr);

        obj.close();
    }
}
