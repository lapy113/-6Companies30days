public class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int sol[] = new int[2];
        for(int i=0; i<arr.length; i++){
            if(arr[Math.abs(arr[i])-1]<0){
                sol[0]=Math.abs(arr[i]);
            }else{
                arr[Math.abs(arr[i])-1] *=-1; 
            }
            
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                sol[1]=i+1;
            }
        }
        return sol;
    }
}class 11 {
    
}
