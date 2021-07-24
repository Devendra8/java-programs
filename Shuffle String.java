
//Given a string s and an integer array indices of the same length.

//The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

//Return the shuffled string.

//Example 3:

//Input: s = "aiohn", indices = [3,1,4,2,0]
//Output: "nihao"




class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res=new char[s.length()];
        String str = "";
        for(int i = 0;i<indices.length;i++){
             res[indices[i]] = s.charAt(i); 
        }
        for(int j =0;j<res.length;j++){
            str = str + res[j];
        }
        return str;
    }
}
