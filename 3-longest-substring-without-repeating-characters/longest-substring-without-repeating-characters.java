class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int left=0;
        int max=0;
         HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0){
                map.remove(l);}
                left++;
            }max=Math.max(max,i-left+1);
        }return max;
    }
}