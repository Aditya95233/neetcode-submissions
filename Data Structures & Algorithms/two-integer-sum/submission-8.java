class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            // int[] res=new int[2];
            int key=target-nums[i];
            if(h.containsKey(key)){
                // res[0]=h.get(key);
                // res[1]=i;
                return new int[]{h.get(key),i};
            }else{
                h.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
