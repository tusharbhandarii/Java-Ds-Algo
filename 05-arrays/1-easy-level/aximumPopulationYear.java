public class aximumPopulationYear {
    public static void main(String[] Args){
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        int output = maximumPopulation(logs);
        System.out.println(output);
    }
    public static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        int startYear = logs[0][0];
        for(int[] year: logs){
            if(year[0]<startYear) startYear = year[0];
        }
        
        for(int[] year: logs){
            int birthYear = year[0];
            int deathYear = year[1];
            arr[birthYear-startYear]++; 
            arr[deathYear-startYear]--;
        }

        int maxPopulation = arr[0];
        int maxYear = 0;
        for(int i=1; i<101; i++){
            arr[i] = arr[i] + arr[i-1];
            if(arr[i]>maxPopulation){
                maxPopulation=arr[i];
                maxYear =i;
            }
        }
        return startYear+maxYear;
    }
}
