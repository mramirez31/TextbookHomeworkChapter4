/**
 * @Class: PrimeNumber
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: February 23, 2023
 *
 * @Description: This program asks for the user to enter an integer and display if
 * the integer is a prime number or not.
 */

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer number: ");
        int number = input.nextInt();

        boolean prime = true;
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
            if(prime){
                System.out.println(number + " is a prime number.");
            }else{
                System.out.println(number + " is not a prime number.");
            }
        }
    }