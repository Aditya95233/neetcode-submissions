class Solution {
    public boolean isAnagram(String s, String t) {
    //    brute force
        if(s.length()!=t.length()) return false;
        // char[] temp1=s.toCharArray();
        // char[] temp2=t.toCharArray();
        // Arrays.sort(temp1);
        // Arrays.sort(temp2);
        // for(int i=0;i<temp1.length;i++){
        //     if(temp1[i]!=temp2[i]) return false;
        // }
        // return true;
// =================================================
    //  better approach
        // int[] res=new int[(int)'z'+1];
        // for(int i=0;i<s.length();i++){
        //     int crrIndadd=s.charAt(i);
        //     res[crrIndadd]+=1;
        //     int crrIndremove=t.charAt(i);
        //     res[crrIndremove]-=1;
        // }
        // for(int i=0;i<res.length;i++){
        //     if(res[i]!=0) return false;
        // }
        // return true;
// ==================================================
//optimal approach
    int[] res=new int[26];
    for(int i=0;i<s.length();i++){
        int addInd=s.charAt(i)-'a';
        res[addInd]+=1;
        int removeInd=t.charAt(i)-'a';
        res[removeInd]-=1;
    }
    for(int i=0;i<26;i++){
        if(res[i]!=0) return false;
    }
    return true;
    }
}
