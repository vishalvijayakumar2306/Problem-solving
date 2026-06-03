class Solution {
    private boolean isalphanum(char c){
        return(c>='a'&& c<='z') ||
        (c>='A' && c<='Z') ||
        (c>='0'&& c<='9');
    }
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char left=s.charAt(l);
            char right=s.charAt(r);
            if(!isalphanum(left)){
               
                l++;
            }
            else if(!isalphanum(right)){

                r--;
            }
            else{
                if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                    return false;
                }
                l++;
                r--;
            }
           

        }
        return true;
    } 
}