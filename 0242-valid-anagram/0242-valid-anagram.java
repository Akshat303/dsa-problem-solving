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

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         // Agar lengths match nahi karti, toh anagram nahi ho sakte
//         if (s.length() != t.length()) {
//             return false;
//         }

//         // 26 size ka frequency array (lowercase English letters ke liye)
//         int[] count = new int[26];

//         // s ke characters ka count badhayein aur t ke ghatayein
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[t.charAt(i) - 'a']--;
//         }

//         // Check karein ki saare counts 0 hain ya nahi
//         for (int c : count) {
//             if (c != 0) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna