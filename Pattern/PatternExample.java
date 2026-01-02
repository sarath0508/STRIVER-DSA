import java.util.Scanner;
public class PatternExample {

    private static void rectangularStar(int n){
        for(int i = 0; i < n; i++, System.out.println())
            for(int j = 0; j < n; j++)
                System.out.print("* ");
    }
    
    private static void rightAngledTriangle(int n){
        for(int i = 0; i < n; i++, System.out.println())
            for(int j = 0; j <= i; j++)
                System.out.print("* ");
    }

    private static void rightAngeledNumbers(int n){
        for(int i = 1; i <= n; i++,System.out.println())
            for(int j = 1; j <= i; j++)
                System.out.print(j+" ");
    }

    private static void rightAngeledNumbersRepeating(int n){
        for(int i = 1; i <= n; i++,System.out.println())
            for(int j = 1; j <= i; j++)
                System.out.print(i+" ");
    }

    private static void invertedRightPyramid(int n){
        for(int i = 0; i < n; i++,System.out.println())
            for(int j = n-i; j > 0 ;j--)
                System.out.print("* ");
    }

    private static void invertedRightNumber(int n){
        for(int i = n; i > 0; i--,System.out.println())
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
    }

    private static void starPyramid(int n){
        for(int i = 0; i < n; i++,System.out.println()){
            for(int j = i; j < n-1; j++)
                System.out.print(" ");

            for(int k = 0; k <= 2*i; k++)
                System.out.print("*");

        }
    }

    private static void invertedStarPyramid(int n){
        for(int i = n; i > 0; i--,System.out.println()){
            for(int j = i; j < n; j++)
                System.out.print(" ");

            for(int k = 0; k < 2*i-1; k++)
                System.out.print("*");
        }
    }

    private static void diamondStar(int n){
        for(int i = 0; i < n; i++,System.out.println()){
            for(int j = n; j > i;j--)
                System.out.print(" ");

            for(int k = 0; k <= 2*i; k++)
                System.out.print("*");
        }

        for(int i = n-1; i >= 0; i--,System.out.println()){
            for(int j = n; j > i;j--)
                System.out.print(" ");

            for(int k = 0; k <= 2*i; k++)
                System.out.print("*");
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // rectangularStar(n);
        // rightAngledTriangle(n);
        // rightAngeledNumbers(n);
        // rightAngeledNumbersRepeating(n);
        // invertedRightPyramid(n);
        // invertedRightNumber(n);
        // starPyramid(n);
        // invertedStarPyramid(n);
        diamondStar(n);
        s.close();
    }
}
