import java.util.Scanner;
class ClimbingStairs {
    /*Using Recursion 
    private static int Solve(int n){
        if(n <= 2)
            return n;
        return Solve(n-1) + Solve(n-2);
    }
    */

    /*Using Memoization */
    private static int Solve(int n,int mem[]){
        if(mem[n] != 0)
            return mem[n];
        if(n <= 2)
            return n;
        return mem[n] = Solve(n-1,mem) + Solve(n-2,mem);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(Solve(n,new int[n+1]));
    }
}
