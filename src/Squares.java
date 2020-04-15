import java.util.Scanner;

public class Squares {
    public static void main (String[] args) {
        int userNum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        userNum = input.nextInt();

        System.out.println("Number          Square");
        System.out.println("-----------------------");

        for(int i = 1; i <= userNum; i++) {
            System.out.println("" + i + "               " + (i*i));
        }
    }
}
