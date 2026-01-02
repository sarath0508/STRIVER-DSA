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
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // rectangularStar(n);
        // rightAngledTriangle(n);
        rightAngeledNumbers(n);
        s.close();
    }
}
