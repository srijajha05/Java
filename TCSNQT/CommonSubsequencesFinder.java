package TCSNQT;

import java.util.*;

public class CommonSubsequencesFinder {

    // Function to generate all subsequences of a string and add them to a set
    public static void findSubsequence(String s, int index, String newString, Set<String> subsequences) {
        if (index == s.length()) {
            if (!newString.isEmpty()) {
                subsequences.add(newString);
            }
            subsequences.add(" ");
            return;
        }
        char ch = s.charAt(index);
        findSubsequence(s, index + 1, newString + ch, subsequences); // Include character
        findSubsequence(s, index + 1, newString, subsequences); // Exclude character
    }

    // Function to find all common subsequences between two strings
    public static Set<String> findCommonSubsequences(String s1, String s2) {
        Set<String> subsequences1 = new HashSet<>();
        Set<String> subsequences2 = new HashSet<>();

        // Generate all subsequences for both strings
        findSubsequence(s1, 0, "", subsequences1);
        findSubsequence(s2, 0, "", subsequences2);

        // Find common subsequences
        subsequences1.retainAll(subsequences2);

        return subsequences1;
    }

    public static void main(String[] args) {
        String s1 = "aple";
        String s2 = "apl";
        Set<String> commonSubsequences = findCommonSubsequences(s1, s2);
        System.out.println("Common Subsequences: " + commonSubsequences);
    }
}

    
