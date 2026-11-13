class Solution {
    public boolean isAnagram(String s, String t) {
        // Agar dono ki length alag hai, toh wo anagram ho hi nahi sakte
        if (s.length() != t.length()) {
            return false;
        }

        // Strings ko character array me convert karein
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        // Dono arrays ko sort karein
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        // Sort karne ke baad compare karke return karein
        return Arrays.equals(sChars, tChars);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna