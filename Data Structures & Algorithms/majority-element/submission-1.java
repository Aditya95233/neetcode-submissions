class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int current=0;
        for(int i : nums){
            if(count ==0){
                current=i;
            }
            if(current==i){
                count++;
            }
            else{
                count--;
            }
        }
        return current;
    }
}