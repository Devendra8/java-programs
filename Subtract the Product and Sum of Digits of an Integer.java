//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

// Example 1:

//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15




class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int prod = 1;
        String s=Integer.toString(n);
        for(int i=0;i<s.length();i++){
          sum = sum + Character.getNumericValue(s.charAt(i));
          prod = prod*Character.getNumericValue(s.charAt(i));
        }
        int result = prod - sum;
        
        return result;
            
        }
    }
