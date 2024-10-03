class RichestCustomerWealth {
    public static void main(String[] Args){
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int[] row : accounts){
            int totalwealth = 0;
            for(int elem : row){
                totalwealth+=elem;
            }
            maxwealth = (maxwealth>totalwealth)? maxwealth:totalwealth;
        }
        return maxwealth;
    }
}