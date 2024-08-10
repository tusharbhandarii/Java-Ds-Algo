import java.util.Scanner;
public class USDtoRuppy {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter currency in USD: ");
        float usd = obj.nextFloat();

        double ruppy = usd*81.85;

        System.out.println("The amount in ruppy is "+ruppy);
        obj.close();
    }
}
