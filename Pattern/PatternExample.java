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

    private static void halfDiamondStar(int n){
        for(int i = 0; i < n; i++,System.out.println()){
            for(int j = 0; j <= i; j++)
                System.out.print("*");
        }

        for(int i = n-2; i > -1; i--,System.out.println()){
            for(int j = 0; j <= i; j++)
                System.out.print("*");
        }
    }

    /*
        half diamond otimised

        for(int i=1;i<=2*N-1;i++){
        
          // stars would be equal to the row no. uptill first half
          int stars = i;
          
          // for the second half of the rotated triangle.
          if(i>N) stars = 2*N-i;
          
          // for printing the stars in each row.
          for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
          
          // As soon as the stars for each iteration are printed, we move to the
          // next row and give a line break otherwise all stars
          // would get printed in 1 line.
          System.out.println();
      }
    */
   
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
        // diamondStar(n);
        halfDiamondStar(n);
        s.close();
    }
}
