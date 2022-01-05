
class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int t = nums[i]%k;
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        for(int i=0; i<nums.length; i++){
            int p = nums[i]%k;
            int t = (k - p)%k;
            if(map.containsKey(p)){
                //remove p
                remove(map,p);
                if(map.containsKey(t)){
                    //remoev t
                    remove(map,t);
                }else{
                    return false;
                }
                
            }
        }
        return true;
    }
    public void remove(HashMap<Integer,Integer> map,int k){
        map.put(k,map.getOrDefault(k,0)-1);
        if(map.get(k)==0){
            map.remove(k);
        }
    }
}