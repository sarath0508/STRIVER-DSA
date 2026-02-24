/*

*     *   *****   *     *   *****   *     *   *     *   *     *    *****   *     *   *     *   *****    *****    *****    *     *    *****    *     *    *****    *****    *****    *****    *****    *     *   *****
**   **  *     *   *   *      *     **   **   *     *   **   **   *        *     *   **   **   *        *     *   *        **    *   *     *   **    *   *     *   *    *      *     *     *     *   *        *        **    *     *
* * * *  *     *    * *       *     * * * *   *     *   * * * *    *****   *     *   * * * *   ****     *     *   ****     * *   *   *     *   * *   *   *     *   *     *     *     *     *     *   *        ****     * *   *     *
*  *  *  *******     *        *     *  *  *   *     *   *  *  *         *   *     *   *  *  *   *        *     *   *        *  *  *   *     *   *  *  *   *******   *     *     *     *******   *        ****     *  *  *     *
*     *  *     *    * *       *     *     *   *     *   *     *   *     *   *     *   *     *   *        *     *   *        *   * *   *     *   *   * *   *     *   *     *     *     *     *   *        *        *   * *     *
*     *  *     *   *   *      *     *     *   *     *   *     *   *     *   *     *   *     *   *        *     *   *        *    **   *     *   *    **   *     *   *    *   *  *     *     *   *        *        *    **     *
*     *  *     *  *     *   *****   *     *    *****    *     *    *****     *****    *     *   *         *****    *        *     *    *****    *     *   *     *   *****     ****     *     *    *****    *****     *     *     *              




Problem Statement: Given an array of N positive integers, we need to return the maximum sum of the subsequence such that no two elements of the subsequence are adjacent elements in the array.

Note: A subsequence of an array is a list with elements of the array where some elements are deleted (or not deleted at all) and the elements should be in the same order in the subsequence as in the array.

Examples
Input: nums = [1, 2, 4]
Output: 5
Explanation: 
Subsequence {1,4} gives maximum sum.

Input:  [2, 1, 4, 9]
Output: 11
Explanation: 
Subsequence {2,9} gives maximum sum.
*/

import java.util.Scanner;

class HouseRobber{

    /*Using Recursion 
    private static int Solve(int n,int houses[]){
        if(n < 0)
            return 0;
        int taken = houses[n] + Solve(n-2,houses);
        int notTaken = Solve(n - 1, houses) ;

        return Math.max(taken,notTaken);
    }
        */

    /*Using Memoization */
        private static int Solve(int n,int houses[],int mem[]){
        if(n < 0)
            return 0;
        if(mem[n] != 0)
            return mem[n];
        int taken = houses[n] + Solve(n-2,houses,mem);
        int notTaken = Solve(n - 1, houses,mem) ;

        return mem[n] = Math.max(taken,notTaken);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int houses[] = new int[n];
        for(int i = 0; i < n; i++)
            houses[i] = s.nextInt();
        System.out.print(Solve(n - 1, houses,new int[n]));
    }
}