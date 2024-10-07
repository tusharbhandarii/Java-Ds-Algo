import java.util.ArrayList;
import java.util.Collections;

public class AddArrayForm {
    public static void main(String[] Args){
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList<Integer> output =  addToArrayForm(num,k);
        System.out.print(output);
    }

    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int number = 0;
        for(int j=1,i=num.length-1;  i>0; i--,j*=10){
            number+=(num[i]*j);
            System.out.println(number);
            
        }
        
        number+=k;

        int i=0;
        while(number>0){
        int rem = number%10;
        result.add(i,rem);
        number/=10;
        i++;
        }

        Collections.reverse(result);

        return result;
    }
}
