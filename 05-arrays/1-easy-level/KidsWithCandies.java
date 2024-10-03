import java.util.*;
class KidsWithCandies {
    public static void main(String[] Args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3; 
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(); 
        int maxCandie = 0;
        for(int candieNum:candies){
            maxCandie = (maxCandie>candieNum)? maxCandie:candieNum;
        }
        for(int i=0; i<candies.length; i++){

            ans.add((candies[i]+extraCandies)>maxCandie);
        }
        return ans;
    }

    static boolean[] kidsWithCandies2(int[] candies, int extraCandies) {
        boolean[] ans = new boolean[candies.length];
        int maxCandie = 0;
        for(int candieNum:candies){
            maxCandie = (maxCandie>candieNum)? maxCandie:candieNum;
        }
        for(int i=0; i<candies.length; i++){

            ans[i]=(candies[i]+extraCandies)>maxCandie;
        }
        return ans;
    }
}