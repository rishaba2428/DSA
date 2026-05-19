class Solution {

    public int maxVowels(String s, int k) {

        int current = 0;
        int max = 0;

        // first window
        for(int i = 0; i < k; i++) {

            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                current++;
            }
        }

        max = current;

        // sliding
        for(int i = k; i < s.length(); i++) {

            char add = s.charAt(i);

            if(add == 'a' || add == 'e' || add == 'i' ||
                    add == 'o' || add == 'u') {

                current++;
            }

            char remove = s.charAt(i-k);

            if(remove == 'a' || remove == 'e' || remove == 'i' ||
                    remove == 'o' || remove == 'u') {

                current--;
            }

            if(current > max) {
                max = current;
            }
        }

        return max;
    }
}