public class Solution {
    public bool IsAnagram(string s, string t) {
  if(s.Length!=t.Length)return false;
         int[] arr=new int[(int)'z'+1];
         for(int i=0;i<s.Length;i++){
            arr[(int)s[i]]=arr[(int)s[i]]+1;
            
            arr[(int)t[i]]=arr[(int)t[i]]-1;
         }
         for(int i=0;i<arr.Length;i++){
            if(arr[i]!=0) return false;
         }
         return true;
    }
}
