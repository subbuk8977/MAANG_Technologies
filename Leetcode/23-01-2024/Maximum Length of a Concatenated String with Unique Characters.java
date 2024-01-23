
/*
    
    1239. Maximum Length of a Concatenated String with Unique Characters :

    You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.

    Return the maximum possible length of s.

    A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.


*/





class Solution {
    
    
    
    public int maxLength(List<String> arr) {
        return backtrack(arr, 0, "");
    }
    private int backtrack(List<String> arr, int index, String current) {
        if (!isUnique(current)) {
            return 0;
        }

        int maxLength = current.length();

        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, i + 1, current + arr.get(i)));
        }

        return maxLength;
    }

    private boolean isUnique(String str) {
        int[] count = new int[26];
        for (char c : str.toCharArray()) {
            if (count[c - 'a'] > 0) {
                return false;
            }
            count[c - 'a']++;
        }
        return true;
    }
}