// An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

class Solution {
    public boolean isPalindrome(int x) {
       int rev = 0 ;
        int num = x;
        if(x<0){
           return false;
       } 
          while(x!=0){
              int rem = x%10;
            x = x/10;
            rev = rev*10 + rem;
          }
        
        return (num==rev);   
       }
}
