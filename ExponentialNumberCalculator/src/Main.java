import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;
        int total=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Number to be exponentiated: ");
        x = input.nextInt();

        System.out.print("The number to be the exponent: ");
        y = input.nextInt();

        for(int i=1; i<=y;i++)
        {
            total*= x;
        }
        System.out.println("Result:" +total);
    }
}