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
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // rectangularStar(n);
        rightAngledTriangle(n);
        s.close();
    }
}
