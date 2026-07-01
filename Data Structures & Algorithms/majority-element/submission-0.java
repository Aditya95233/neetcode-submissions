class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        int max=0;
        int resKey=0;
        for(int key:h.keySet()){
            int a=h.get(key);
            if(a>max){
                max= a;
                resKey=key;
            }
        }
        return resKey;
    }
}