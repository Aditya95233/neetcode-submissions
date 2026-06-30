class Solution {
    public String longestCommonPrefix(String[] strs) {
      int c=strs[0].length();
    //   System.out.println(c);
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<c){
                c=strs[i].length();
            }
        }
        // System.out.println(c);
        for(int i=0;i<strs.length-1;i++){
                String s1=strs[i];
                String s2=strs[i+1];
                // System.out.println("s1 ");
                // System.out.println(s1 );
                // System.out.println("s2");
                
                // System.out.println(s2);
            for(int j=0;j<c;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                   if(j==0){
                    return "";
                   }
                    c=j;
                    break;
                }
            }
        }
        // System.out.println(c);
        StringBuilder s=new StringBuilder("");
        for(int i=0;i<c;i++){
            s.append(strs[0].charAt(i));
        }
        return s.toString();  
    }
}