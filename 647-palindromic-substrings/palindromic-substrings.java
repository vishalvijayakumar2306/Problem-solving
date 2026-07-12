class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int a=0;
        int b=0;
       for(int i=0;i<n;i++){
         a+= isp(s,i,i)+ isp(s,i,i+1);
       } 
       return a;
    } 
        private int isp(String s,int l, int r){
            int count=0;
            while(l>=0 && r<s.length()&& s.charAt(l)==s.charAt(r)){
                count++;
                l--;
                r++;
            } return count;
        }
}