class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return (isPalindrome(s,l+1,r)||
                (isPalindrome(s,l,r-1)));
            }
        }return true;
    }
    private boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }return true;
    }
}