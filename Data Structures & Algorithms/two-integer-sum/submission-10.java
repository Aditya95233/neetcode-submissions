class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target) return new int[]{i,j};
        //     }
        // }
        // return new int[]{0,1};
        Map<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tempKey=target-nums[i];
            if(h.containsKey(tempKey)){
                int firstInd=h.get(tempKey);
                return new int[]{firstInd,i};
            }
            else{
                h.put(nums[i],i);
            }
        }
        return new int[]{0,1};
    }
}
