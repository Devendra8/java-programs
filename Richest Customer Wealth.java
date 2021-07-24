//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

 

//Example 1:

//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.



class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] ary = new int[accounts.length];
        
        for(int i = 0;i<accounts.length;i++){
            int sum = 0;
            for(int j =0;j<accounts[i].length;j++){
                
                sum = sum + accounts[i][j];
                ary[i] = sum;
            }
        }
        for(int i=0;i<ary.length;i++){
            for(int j=1;j<ary.length;j++){
                if(ary[i]<ary[j]){
                    int temp = ary[i];
                    ary[i] = ary[j];
                    ary[j] = temp;
                }
            }
        }
        int fin = ary[0];
        
        return fin;
        
    }
}
