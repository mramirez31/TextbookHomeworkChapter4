import java.util.Scanner;

/**
 * @Class: CharacterAndStringValue
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program will ask the user to enter a string and character for the program where it will then
 * go through the string and look for the last time the character provided last occurred and will count where it last occurred and that
 * will display as the index and print out a statement where is its last occurrence of the character was in the string and what is index was
 * and if the user gives a character that is not in the string then that will equal negative one as there is nowhere in the string it occurred.
 *
 */
public class CharacterAndStringValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strValue = input.nextLine();

        System.out.print("Enter a Character: ");
        String charValue = input.nextLine();

        int index = strValue.lastIndexOf(charValue);

        System.out.println("The last occurrence of character " + charValue + " in " + strValue + " is at index " + index);

    }
}
