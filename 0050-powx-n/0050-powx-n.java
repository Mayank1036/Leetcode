class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long m = n;
            
        if(m < 0){
            x = 1/x;
            m = -m;
        }
        while( m > 0){
            if(m%2 == 1){ // power is odd
                ans = ans*x;
                m--;
            }
            else{     //power is even 
                x*= x;
                m = m/2;  //power will reduced by factor of 2
            }
        }
        return ans;
        
    }
}