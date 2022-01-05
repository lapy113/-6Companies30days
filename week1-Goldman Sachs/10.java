class Solution
{ 
    static ArrayList<Integer> kTop(int[] a, int n, int k) 
    { 
        //code here.
        PriorityQueue<Integer> q  = new PriorityQueue<>();
        ArrayList<Integer> sol= new ArrayList<>();
        for(int i=0; i<k; i++){
            q.add(a[i]);
        }
        for(int i=k; i<n; i++){
            if((!q.contains(a[i]))&&a[i]>q.peek()){
                q.poll();
                q.add(a[i]);
            }
        }
        for(int i=0; i<k; i++){
            sol.add(q.poll());
        }
        return sol;
    }
}