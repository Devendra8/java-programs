// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

//Example 1:

//Input: x = 123
//Output: 321





class Solution {
    public int reverse(int x) {
        int rev =0;
        if(x ==0)
            return 0;
        while (x!=0){
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + x%10;
            x = x/10;
        }
        return rev;
    }
}