class Solution {
    public boolean isAnagram(String s, String t) {


        //  create hash array
        int[] hash = new int[26];

        //  count letters in s
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hash[ch - 'a']++;
        }

        // subtract letters using t
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hash[ch - 'a']--;
        }

        //  check if all zero
        for(int i = 0; i < 26; i++) {
            if(hash[i] != 0) {
                return false;
            }
        }
        // if it reaches here return true
        return true;
    }
}
