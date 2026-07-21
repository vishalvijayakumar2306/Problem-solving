class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        int n=s.length();
        int k=p.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int left=0;
        for(int r=0;r<n;r++){
            map2.put(s.charAt(r),map2.getOrDefault(s.charAt(r),0)+1);
            if(r-left+1>k){
                char l=s.charAt(left);
                map2.put(l,map2.get(l)-1);
                if (map2.get(l) == 0) {
                    map2.remove(l);
                }
                left++;
            }
            if(r-left+1==k){
            if(map.equals(map2)){
                list.add(left);
            }
        }

    }return list;
}}