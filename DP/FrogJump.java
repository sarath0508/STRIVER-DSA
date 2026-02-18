/*

Given an integer array height[] where height[i] represents the height of the i-th stair, a frog starts from the first stair and wants to reach the last stair.
From any stair i, the frog has two options: it can either jump to the (i+1)th stair or the (i+2)th stair.
The cost of a jump is the absolute difference in height between the two stairs.
Determine the minimum total cost required for the frog to reach the last stair.

Example:

Input: heights[] = [20, 30, 40, 20]
Output: 20
Explanation:  Minimum cost is incurred when the frog jumps from stair 0 to 1 then 1 to 3:
jump from stair 0 to 1: cost = |30 - 20| = 10
jump from stair 1 to 3: cost = |20 - 30| = 10
Total Cost = 10 + 10 = 20

Input: heights[] = [30, 20, 50, 10, 40]
Output: 30
Explanation: Minimum cost will be incurred when frog jumps from stair 0 to 2 then 2 to 4:
jump from stair 0 to 2: cost = |50 - 30| = 20
jump from stair 2 to 4: cost = |40 - 50| = 10
Total Cost = 20 + 10 = 30

*/

import java.util.Scanner;


class FrogJump{
    /*Using recursion 
    private static int Solve(int n,int[] heights){
        if(n == 0)
            return 0;
        
        int step2 = Integer.MAX_VALUE;
        int step1 = Solve(n-1,heights) + Math.abs(heights[n] - heights[n-1]); 
        if(n > 1)
            step2 = Solve(n-2,heights) + Math.abs(heights[n] - heights[n-2]);

        return Math.min(step1,step2);
    }
        */

    /*Using Memoization
    private static int Solve(int n,int[] heights,int[] mem){
        if(n == 0)
            return 0;
        if(mem[n] != 0)
            return mem[n];
        int step2 = Integer.MAX_VALUE;
        int step1 = Solve(n-1,heights,mem) + Math.abs(heights[n] - heights[n-1]); 
        if(n > 1)
            step2 = Solve(n-2,heights,mem) + Math.abs(heights[n] - heights[n-2]);

        return mem[n]=Math.min(step1,step2);
    }
        */

    /*Using tabulatio(dp) */
    private static int Solve(int n,int[] heights){
        int dp[] = new int[n+1];
        dp[0]=0;
        for(int i = 1; i < n; i++){
            int step2 = Integer.MAX_VALUE;
            int step1 = dp[i-1] + Math.abs(heights[i] - heights[i-1]); 
            if(i > 1)
                step2 = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            dp[i]=Math.min(step1,step2);
        }
            
        return dp[n-1];
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int heights[] = new int[n];
        for(int i = 0; i < n; i++)
            heights[i] = s.nextInt();
        System.out.print(Solve(n, heights));
    }
}