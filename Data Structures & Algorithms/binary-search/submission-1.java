class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int ind=(i+j)/2;
            // System.out.println("ind");
            // System.out.println(nums[ind]);
            if(nums[ind]==target){
                return ind;
            }
            else if(nums[ind]<target){
                i=ind+1;
                // System.out.println(i);
                
                // System.out.println(j);
            }
            else{
                j=ind-1;
                
                // System.out.println(i);
                // System.out.println(j);
            }
        }
        return -1;
    }
}