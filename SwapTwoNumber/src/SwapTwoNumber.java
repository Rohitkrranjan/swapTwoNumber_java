import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value x ");
        int x = input.nextInt();
        System.out.println("Enter the value of y ");
        int y = input.nextInt();

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.print("x = "+x+" ");
        System.out.print("y = "+y);




    }
}
