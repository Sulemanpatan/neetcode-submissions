class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> h=new HashMap<>();
        int n=nums.length;
        for(int a:nums){

            h.put(a,h.getOrDefault(a,0)+1);
            if(h.get(a)>n/2){
               return a;
            }
        }
        return -1;
    }
}
