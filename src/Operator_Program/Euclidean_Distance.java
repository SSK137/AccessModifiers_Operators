package Operator_Program;
import java.util.*;

public class Euclidean_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("Enter Y");
        int y = sc.nextInt();

        double distance=Math.sqrt(x*x + y*y );
        System.out.println("Euclidean distance from point (x, y) to the origin (0, 0) : " + distance);
    }
}
