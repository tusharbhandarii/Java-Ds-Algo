public class HighestAltitude {
    public static void main(String[] Args){
        int[] gain = {-5,1,5,0,-7};
        int output = largestAltitude2(gain);
        System.out.println(output);

    }

    // optimise version T.C : O(n)  S.C : O(1)
    static int largestAltitude2(int[] gain) {
        int maxAltitude = 0;
        int mileStone = 0;
        for(int i=0; i<gain.length; i++){
            int currentAltitude = mileStone-(-gain[i]);
            if(currentAltitude>maxAltitude){
                maxAltitude = currentAltitude;
            }
            mileStone = currentAltitude;
        }
        return maxAltitude;   
    }
    
    static int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        int start = 0;
        for(int i=0; i<gain.length; i++){
            altitude[i] = start-(-gain[i]);
            start = altitude[i];
        }

        int maxAltitude = altitude[0];
        for(int i=1; i<altitude.length; i++){
            if(altitude[i]>maxAltitude) maxAltitude= altitude[i];
        }
        return maxAltitude;
        
    }
}
