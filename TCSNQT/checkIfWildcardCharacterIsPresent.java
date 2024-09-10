package TCSNQT;

public class checkIfWildcardCharacterIsPresent {

    public static boolean isMatch(String pattern, String text) {
            int pIndex = 0; // Index for pattern
            int tIndex = 0; // Index for text
            int starIndex = -1; // Index of the last '*' in pattern
            int matchIndex = 0; // Index of text to match after '*'
    
            while (tIndex < text.length()) {
                // If current characters match or pattern has '?'
                if (pIndex < pattern.length() && (pattern.charAt(pIndex) == text.charAt(tIndex) || pattern.charAt(pIndex) == '?')) {
                    pIndex++;
                    tIndex++;
                }
                // If pattern has '*', record its position and try to match remaining text
                else if (pIndex < pattern.length() && pattern.charAt(pIndex) == '*') {
                    starIndex = pIndex;
                    matchIndex = tIndex;
                    pIndex++;
                }
                // If last pattern character was '*', try to match more characters
                else if (starIndex != -1) {
                    pIndex = starIndex + 1;
                    matchIndex++;
                    tIndex = matchIndex;
                }
                // No match and no '*' to fall back on
                else {
                    return false;
                }
            }
    
            // Check for remaining '*' in pattern
            while (pIndex < pattern.length() && pattern.charAt(pIndex) == '*') {
                pIndex++;
            }
    
            // If we have processed all of the pattern, return true
            return pIndex == pattern.length();
    }
    
        // Function to test cases
    public static void test(String pattern, String text) {
            if (isMatch(pattern, text)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
    }
    
        // Main function to run the program
    public static void main(String[] args) {
            test("a*b", "aabb"); // Yes
            test("a?b", "acb"); // Yes
            test("a*c", "abc"); // Yes
            test("a*c", "ac"); // Yes
            test("a*d", "abcd"); // Yes
    }
}