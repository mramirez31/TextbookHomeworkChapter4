import java.util.Scanner;

/**
 * @Class: ReverseString
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program will ask the user to input a string that they want to be converted to be reverse
 * and that will then be made to show the reverse of the word and then be put into the for statement where it
 * will determine if the string value and the reverse string value are equal or not and print out a
 * statement saying if they are equal or not and print out a statement showing the original string and showing it reverse with it.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str1 = input.nextLine();
        String str1Reverse = "";
        for(int i = str1.length()-1; i >= 0; i--){
            str1Reverse = str1Reverse + str1.charAt(i);
        }
        System.out.println("The reverse of " + str1 + " is " + str1Reverse);
        System.out.println(str1Reverse);

        if(str1 == str1Reverse){
            System.out.println("The String value " + str1 + " is equal to its reverse String value " + str1Reverse);
        }
        else{
            System.out.println("The string value " + str1 + " and its reverse string value " + str1Reverse + " are not equal");
        }

    }
}
