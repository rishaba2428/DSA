class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal))
        {
            return true;
        }

        for(int i = 1;i<s.length();i++)
        {
            char temp = s.charAt(0);

            s = s.substring(1)+temp;
            if(s.equals(goal))
            {
                return true;

            }}

        return false;

    }
}