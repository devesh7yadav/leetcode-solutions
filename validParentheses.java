//Valid Parentheses Solution
//Solved May 13th, 2026

class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        char[] values = new char[length];
        int index = 0;

        //Start at the beginning of the String
        for (int i = 0; i < length; i++){
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '['){  //Check for Left
                values[index] = current;
                index++;
            } else if (current == ')' || current == '}' || current == ']'){ //Check for Right
                if (index == 0 || values[index-1] == '(' && current != ')' || values[index-1] == '{' && current != '}' || values[index-1] == '[' && current != ']'){ //No pair
                    return false;
                } else{ //Pair
                    values[index-1] = 0;
                    index--;
                }
            }
        }

        return values[0] == 0;
    }
}