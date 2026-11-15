public class Solution {
    public int MajorityElement(int[] nums) {
        int currentElement=nums[0];
        int count =0;
        foreach(int i in nums){
            if(count==0){
               currentElement=i; 
            }
            count += (currentElement == i) ? 1:-1; 
        }
        return currentElement;
    }
}