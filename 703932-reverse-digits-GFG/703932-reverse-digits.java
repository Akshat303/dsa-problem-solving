class Solution {
    public int reverseDigits(int n) {
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;       // last digit nikalo
            reverse = reverse * 10 + digit;
            n = n / 10;               // last digit hatao
        }

        return reverse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna