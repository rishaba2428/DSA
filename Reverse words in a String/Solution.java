class Solution {
    public String reverseWords(String s) {

        String[] arr = s.split(" ");

        String ans = "";

        for(int i = arr.length - 1; i >= 0; i--) {

            // empty string skip panna
            if(arr[i].equals("")) {
                continue;
            }

            ans = ans + arr[i];

            // last word ku apram extra space vara koodadhu
            if(i != 0) {
                ans = ans + " ";
            }
        }

        return ans.trim();
    }
}

