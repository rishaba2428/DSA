class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        //  create hash array
        HashMap <Character ,Integer> map =new HashMap<>();

        //  count letters in s
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        // subtract letters using t
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if(!map.containsKey(ch)|| map.get(ch)==0)
            {
                return false;
            }

            map.put(ch,map.get(ch)-1);



        }


        // if it reaches here return true
        return true;
    }
}
