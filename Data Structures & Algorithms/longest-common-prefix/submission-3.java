    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int minlength=strs[0].length();
            StringBuilder s=new StringBuilder();
            for(int i=0;i<strs.length-1;i++){
                int j=0;
                String s1=strs[i];
                String s2=strs[i+1];
                // if(s1.length()<minlength){
                //     minlength=s1.length();
                // }
                // else if(s2.length() < minlength){
                //     minlength=s2.length();
                // }
            minlength=Math.min(minlength,Math.min(s1.length(),s2.length()));
                while(j<minlength){
                    if(s1.charAt(j)!=s2.charAt(j)){
                        minlength=j;
                        break;
                    }
                    j++;
                }
            }
            for(int i=0;i<minlength;i++){
                s.append(strs[0].charAt(i));
            }
            return s.toString();
        }
    }