public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        Dictionary<int,int> h =new Dictionary<int,int>();
        h.Add(nums[0],0);
        for(int i=1;i<nums.Length;i++){
            int res=target-nums[i];
            if(h.ContainsKey(res)){
                return new int[]{h[res],i};
            }
            else{
                h.Add(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}
