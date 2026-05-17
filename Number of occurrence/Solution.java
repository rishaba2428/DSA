class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        HashMap <Integer,Integer> map = new HashMap<> ();
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==target)
                count ++;
        }
        return count;
    }
}
