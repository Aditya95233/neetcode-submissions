class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length<=1) return false;
        HashSet<Integer> h = new HashSet();
        h.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(h.contains(nums[i])){
                return true;
            }
            else{
                h.add(nums[i]);
            }
        }
        return false;
    }
}