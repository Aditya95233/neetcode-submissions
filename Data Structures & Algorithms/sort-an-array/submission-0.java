class Solution {
    public int[] sortArray(int[] nums) {
        // List<Integer> ds=new ArrayList<>();
        sortArrayFinal(nums,0,nums.length-1);
        return nums;
    }
    public void sortArrayFinal(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        sortArrayFinal(nums,low,mid);
        sortArrayFinal(nums,mid+1,high);
        mergeData(nums,low,mid,high);
    }
    public void mergeData(int[] nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer>ds=new ArrayList<>();
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                ds.add(nums[left++]);
            }
            else{
                ds.add(nums[right++]);
            }
        }
        while(left<=mid){
            ds.add(nums[left++]);
        }
        while(right<=high){
            ds.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=ds.get(i-low);
        }
    }
}