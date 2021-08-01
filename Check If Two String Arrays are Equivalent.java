//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

//A string is represented by an array if the array elements concatenated in order forms the string.

 

//Example 1:

//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.




class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        
        for(int i =0;i<word1.length;i++){
            a = a +word1[i];
        }
        for(int i =0;i<word2.length;i++){
            b = b +word2[i];
        }
        
        if(a.equals(b)){
            return true;
        } else
            return false;
    }
}
