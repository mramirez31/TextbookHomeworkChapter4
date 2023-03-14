import java.util.Scanner;

/**
 * @Class: FactorialNumber
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program ask for the user to enter a number that will then
 * be put into the program where it will loop until it reaches its factorial number.
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 1;
        for( int i = 1; i <= num; i++){
            count = count * i;
            System.out.print(i + "*");
        }
        System.out.println("Factorial of " + num + " is " + count);
    }
}
