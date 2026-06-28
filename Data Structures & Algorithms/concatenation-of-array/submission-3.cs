public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int[] arr =new int[nums.Length*2];
        for(int i=0;i<nums.Length;i++){
            arr[i]=nums[i];
            arr[nums.Length+i]=nums[i];
        }
        return arr;
    }
}