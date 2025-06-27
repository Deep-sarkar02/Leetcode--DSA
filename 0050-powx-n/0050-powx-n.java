class Solution {
    public double myPow(double x, int n) 
    {

        // if the exponent is neg
        if(n< 0) 
        {
            // convert to tlong
            long val = (long)n;
            return 1.0/ helper(x , Math.abs(val));
        }
        else
        {
            // if it is pos
            return helper(x , n);
        }
    }
    public double helper(double x , long n)
    {
         // base case
        if(n == 0)
        {
            return 1.0;
        }
        // nowe
        double temp = helper(x , n/2);
        temp = temp * temp;
        // check if the power is odd or not
        if(n% 2!= 0)
        {
            return temp * x ;
        }
        else
        {
            return temp;
        }
        
    }
       
    
}