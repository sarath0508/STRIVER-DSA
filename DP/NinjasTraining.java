/*

Example 1:
Input: matrix = [[10, 40, 70], [20, 50, 80], [30, 60, 90]]
Output: 210
Explanation:
Day 1: fighting practice = 70
Day 2: stealth training = 50
Day 3: fighting practice = 90
Total = 70 + 50 + 90 = 210
This gives the optimal points.

Example 2:
Input: matrix = [[70, 40, 10], [180, 20, 5], [200, 60, 30]]
Output: 290 
Explanation:
Day 1: running = 70
Day 2: stealth training = 20
Day 3: running = 200
Total = 70 + 20 + 200 = 290
This gives the optimal points.


*/

import java.util.Scanner;

class NinjasTraining{
    /*Using recursion
    private static int Solve(int tasks[][],int day,int prev){
        int maxPoint = 0;
        if(day == 0){
            for(int i = 0; i < 3; i++)
                if(i != prev)
                    maxPoint = Math.max(maxPoint,tasks[0][i]);
            }
        else{
            int currPoint = 0;
            for(int i = 0; i < 3; i++)
                if(i != prev){
                    currPoint = tasks[day][i] + Solve(tasks, day - 1, i); 
                    maxPoint = Math.max(currPoint,maxPoint);
                }
        }
        return maxPoint;
    }
        */

    /*Using memoization */
    private static int Solve(int tasks[][],int day,int prev,int mem[][]){
        int maxPoint = 0;
        if(day == 0){
            for(int i = 0; i < 3; i++)
                if(i != prev)
                    maxPoint = Math.max(maxPoint,tasks[0][i]);
        }
        else if(mem[day][prev] != 0)
            return mem[day][prev];
        else{
            int currPoint = 0;
            for(int i = 0; i < 3; i++)
                if(i != prev){
                    currPoint = tasks[day][i] + Solve(tasks, day - 1, i, mem); 
                    maxPoint = Math.max(currPoint,maxPoint);
                }
            }
        return mem[day][prev] = maxPoint;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = s.nextInt();

        System.out.print(Solve(arr,r-1,c,new int[r][c+1]));
    }
}