import java.util.Scanner;
class ClimbingStairs {
    /*Using Recursion */
    private static int Solve(int n){
        if(n <= 2)
            return n;
        return Solve(n-1) + Solve(n-2);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(Solve(n));
    }
}
