class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int arr[] =new int[26];
        for(int i=0;i<s.length();i++){
            int incind=s.charAt(i) -'a';
            arr[incind]++;
            int decind=t.charAt(i) - 'a';
            arr[decind]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}
