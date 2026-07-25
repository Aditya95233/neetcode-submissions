class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] finalArray=new int[nums.length *2];
        for(int i=0;i<nums.length;i++){
            int nextInd=i+nums.length;
            finalArray[i]=nums[i];
            finalArray[nextInd]=nums[i];
        }
        return finalArray;
    }
}