class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if(prices.length<=1){
            return money;
        }else{
            if(prices[0]+prices[1]<=money){
                money=money-(prices[0]+prices[1]);
            }
            else{
                return money;
            }
        }
        return money;
    }
}