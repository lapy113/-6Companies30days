class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        long a[]=new long[n+5];
        a[0] = 1;
        int c2=0,c3=0,c5=0;
        for(int i=1; i<=n; i++){
            long t = min(a[c2]*2,a[c3]*3,a[c5]*5);
            if(t==a[c2]*2){
                c2++;
            }
            if(t==a[c3]*3){
                c3++;
            }
            if(t==a[c5]*5){
                c5++;
            }
            a[i] = t;
        }
        return a[n-1];
    }
    
    long min(long a,long b,long c){
        if(a<b){
            return a<c ? a : c;
        }
        return b<c ? b:c;
        
    }
}