class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n  = S.length(),num=1;
        Stack<Integer> stack = new Stack<>();
        String sol = "";
        for(int i=0; i<n; i++){
            char c = S.charAt(i);
            if(c=='D'){
                stack.push(num++);
            }else{
                stack.push(num++);
                while(!stack.isEmpty()){
                    sol = sol + String.valueOf(stack.pop());
                }
            }
        }
        stack.push(num);
        while(!stack.isEmpty()){
                    sol = sol + String.valueOf(stack.pop());
                }
                
        return sol;
    }
}