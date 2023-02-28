/**
 * @Class: SumOfDigits
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: February 23, 2023
 *
 * @Description: The program will ask for the users to input an integer
 * that will then run in the code and display the sum of the digits
 * from the provided integer the user put.
 */

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits for the integer is: " + sum);

    }
}
