class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        PriorityQueue<int[]>p=new PriorityQueue<>((a,b)->a[1]-b[1]);
        // for(Integer i:h.keySet()){
        //     System.out.print(i);
        //     System.out.println(h.get(i));
        // }
        // System.out.println(h.get(3));
        h.forEach((kk,v)->{

        int[] res=new int[2];
            res[0]=kk;
            res[1]=v;
            System.out.println(kk);
            System.out.println(v);
            p.offer(res);
            if(p.size()>k){
                p.poll();
            }
        } );
        int[] arr= new int[k];
        for(int i=0;i<k;i++){
            // System.out.println(p.peek()[0] + " : "+ p.peek()[1]);
            arr[i]=p.poll()[0];
        }
        return arr;
    }
}