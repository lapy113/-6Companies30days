class GfG
 {
	String encode(String str)
	{
          //Your code here
          String sol = "";
          
          for(int i=0; i<str.length(); i++){
              int j=i;
              while(j<str.length()&&str.charAt(i)==str.charAt(j)){
                  j++;
                  
              }
              int k = j-i;
              sol = sol + str.charAt(i)+String.valueOf(k);
              i=j-1;
          }
          return sol;
	}
	
 }