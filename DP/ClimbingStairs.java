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

    /*Using Space Optimised DP */
    private static int Solve(int n){
        int dp[] = new int[n+1];
        dp[0] = 1; // 1-step can be reached in 1 way only
        dp[1] = 2; // 2-step can be reached in 1+1 or 2 directly so totally 2 ways
        for(int i = 2; i <= n; i++)
            dp[i] = dp[i-1] + dp[i-2];
        return dp[n-1];
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(Solve(n));
    }
}
