import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] Args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter a charecter: ");
        char ch = obj.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.println(ch+" is a vowel");
        }else{
            System.out.println(ch+" is a consonant");
        }

        obj.close();
    }
}
