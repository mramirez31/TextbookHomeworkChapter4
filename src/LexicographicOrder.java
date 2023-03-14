import java.util.Scanner;

/**
 * @Class: LexicographicOrder
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program is about will prompt the user for two strings that will then be put into the program
 * where it will display if string 1 or 2 is greater than the other string or if they are equal by their character length
 * and then will move on to the compare part of the program where it will then see
 * if both are equal or if one of the string comes before the other string
 * that will then generate a new sentence from the strings given by the user.
 */
public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        int line1 = str1.length();

        System.out.print("Enter String 2: ");
        String str2 = input.nextLine();
        int line2 = str2.length();

        if(line1 > line2) {
            System.out.println("String 1 " + str1 + " is longer than String 2 " + str2);
        }
        else if (line1 < line2) {
            System.out.println("String 2 " + str2 + " is longer than string 1 " + str1);
        }
        else
            System.out.println("String 1 " + str1 + " is equal to String 2 " + str2);

        int charOrder = str1.compareTo(str2);
        if(charOrder < 0){
            System.out.println("String 1 " + str1 + " appears before string 2 " + str2 + " in lexicographic order");
            System.out.println("New sentence is: " + str1 + " " + str2);
        }
        else if (charOrder == 0){
            System.out.println("String 1 " + str1 + " and String 2 " + str2 + " are both equal to each other");
        }
        else{
            System.out.println("String 2 " + str2 + " appears before string 1 " + str1 + " in lexicographic order");
            System.out.println("New sentence is: " + str2 + " " + str1);
        }
    }
}
