class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] finalArray=new int[nums.length *2];
        for(int i=0;i<nums.length;i++){
            finalArray[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int ind=nums.length + i;
            finalArray[ind]=nums[i];
        }
        return finalArray;
    }
}