class Solution {
    public static void print_divisors(int n) {
        // code here
        int digit = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                digit=i;
                System.out.print(digit+" ");
            }
        }
    }
}