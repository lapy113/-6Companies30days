class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int sol = 0;
        long p = 1;
        int i=0,j=0;
        
        while(j<n){
            if(p<k){
                
                p = p*a[j];
                j++;
                
            }
            
            while(p>=k){
                p = p/a[i];
                i++;
            }
            
            sol +=j-i;
        }
        return sol;
    }
}