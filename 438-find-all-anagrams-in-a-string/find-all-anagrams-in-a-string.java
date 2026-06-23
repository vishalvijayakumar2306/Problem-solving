class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if (k > n) {
            return res;
        }

        int[] pCount = new int[26];
        int[] wCount = new int[26];

        // frequency of p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        // first window
        for (int i = 0; i < k; i++) {
            wCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, wCount)) {
            res.add(0);
        }

        // slide window
        for (int i = k; i < n; i++) {

            // add new character
            wCount[s.charAt(i) - 'a']++;

            // remove old character
            wCount[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(pCount, wCount)) {
                res.add(i - k + 1);
            }
        }

        return res;
    }
}