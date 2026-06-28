class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr =new int [nums.length*2];
        return getFinalResult(arr,2,nums);
    }
    public int[] getFinalResult(int[] finall,int c,int[] original){
        if(c==0){
            return finall;
        }
        if(c==1){
        for(int i=0;i<original.length;i++){
            finall[original.length + i]=original[i];
        }    
        }
        else{
        for(int i=0;i<original.length;i++){
            finall[i]=original[i];
        }
        }
        return getFinalResult(finall,--c,original);
    }
}