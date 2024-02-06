// Harmonic Lemma - pattern

public class Solution {
    public static int sumOfAllDivisors(int n){
        int ans = 0;
        int l = 1;

        // Iterating over all values of 'l' such that 'n/l' is distinct.
        // There at most 2*sqrt(n) such values.
        while (l <= n)
        {
            int val = n / l;

            // 'r' = maximum value of 'i' such that 'n/i' is val.
            int r = n / val;

            ans += ((r * (r + 1)) / 2 - (l * (l - 1)) / 2) * val;

            // moving on to next range.
            l = r + 1;
        }

        return ans;
    }
}