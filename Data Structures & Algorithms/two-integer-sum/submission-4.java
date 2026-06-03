class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
         int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     if(nums[i]+nums[j]==target){
        //         ans[0]=i;
        //         ans[1]=j;
        //         return ans;
        //     }
        //     else if(nums[i]+nums[j]<target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // return ans;
         HashMap<Integer,Integer> h=new HashMap<>();
                // nums, index
        for(Integer x:nums){
            if(h.containsKey(target-x)){
                ans[0]=h.get(target-x);
                ans[1]=i;
            }
            else{
                h.put(x,i);
            }
            i++;
        }
        return ans;
    }
}
