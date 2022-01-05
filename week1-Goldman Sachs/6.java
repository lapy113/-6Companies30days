class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2)||str2.equals("")){
            return str1;
        }
        String l = str2;
        if(str1.length()<str2.length()){
            str2 = str1;
            str1 = l;
        }
        int i=0;
        while(i<str2.length()){
            if(str1.charAt(i)!=str2.charAt(i)){
                return "";
            }
            i++;
        }
        return gcdOfStrings(str1.substring(i,str1.length()),str2);
        
        
    }
}