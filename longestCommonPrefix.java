//Longest Common Prefix Solution

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";

        String word = strs[0];
        for(int i = 0; i < word.length();i++){
            char c = word.charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(strs[j].length() <= i || c != strs[j].charAt(i)){
                    return longest;
                }                 
            }

            longest += c;
        }

        return longest;        
    }
}