import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome, enter a coordinate pair: ");
        String coord1 = scan.nextLine();

        System.out.print("Enter another coordinate pair: ");
        String coord2 = scan.nextLine();

        System.out.print("The two points are: " + coord1 + "and " + coord2 );



    }
}
