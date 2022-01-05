class Solution{
    static String decodedString(String s){
        // code here
        Stack<String> stack = new Stack<>();
        int n = s.length();
        String sol = "",num="";
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            while(i<n&&c>='0'&&c<='9'){
                num = num+c;
                i++;
                c = s.charAt(i);
            }
            
            if(!num.equals("")){
                if(sol.length()!=0)
                stack.push(sol);
                sol = "";
                
                stack.push(num);
                num = ""; 
            }
            
           
                
            if(c>='a'&&c<='z'){
                sol+=c;
            }
            if(c==']'){
                String t = stack.pop();
                try {
                    int l = Integer.parseInt(t);
                    sol = sol.repeat(Integer.valueOf(t));
                }
                
                catch(NumberFormatException nfe) {
                    sol = t + sol;
                }
                
            }
            
        }
        
        while(!stack.isEmpty()){
            String t = stack.pop();
            try {
                    int l = Integer.parseInt(t);
                    sol = sol.repeat(Integer.valueOf(t));
                }
                
                catch(NumberFormatException nfe) {
                    sol = t + sol;
                }
        }
        return sol;
    }
}