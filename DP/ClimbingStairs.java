/*

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/

import java.util.Scanner;
class ClimbingStairs {
    /*Using Recursion 
    private static int Solve(int n){
        if(n <= 2)
            return n;
        return Solve(n-1) + Solve(n-2);
    }
    */

    /*Using Memoization
    private static int Solve(int n,int mem[]){
        if(mem[n] != 0)
            return mem[n];
        if(n <= 2)
            return n;
        return mem[n] = Solve(n-1,mem) + Solve(n-2,mem);
    }
     */

    /*Using Tabulation DP 
    private static int Solve(int n){
        int dp[] = new int[n+1];
        dp[0] = 1; // 1-step can be reached in 1 way only
        dp[1] = 2; // 2-step can be reached in 1+1 or 2 directly so totally 2 ways
        for(int i = 2; i <= n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n-1];
    }
        */

    /*Using Space Optimised */
    private static int Solve(int n){
        int prev = 1;
        int curr = 2;
        int temp = 1;
        for(int i = 2; i <= n; i++){
            temp = prev + curr;
            prev = curr; 
            curr = temp;
        }
        return prev;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(Solve(n));
    }
}
