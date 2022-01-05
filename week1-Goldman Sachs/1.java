class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0; i<string_list.length; i++){
            String o = string_list[i];
            char d[]= o.toCharArray();
            Arrays.sort(d);
            String key = String.valueOf(d);
            ArrayList<String> sr = new ArrayList<>();
            if(map.containsKey(key)){
                sr = map.get(key);
            }
            
            sr.add(o);
            
            map.put(key,sr);
        }
        ArrayList<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}