class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // initialise the max profit and  the buying prce var with 0 and the max 
        int max_prfit = 0;
        int buying_price = Integer.MAX_VALUE;

        // now loop over the array
        for(int i= 0 ; i<prices.length ; i++)
        {
            if(buying_price < prices[i] ) // it can be profit
            {
                int profit = prices[i]- buying_price;
                max_prfit = Math.max(profit ,max_prfit);
            }
            else
            {
                buying_price = prices[i];
            }
        }
        return max_prfit;
    }
}