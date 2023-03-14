import java.util.Scanner;

/**
 * @Class: HighestAndLowestGrade
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program will ask for the user to put a total of how many student's there are in the class
 * and then ask for the grades and will then determine which student had the highest grade in the class and which had the lowest
 * and will give the results to the user.
 */

public class HighestAndLowestGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        System.out.print("Enter the Student's grades: ");
        int grade = input.nextInt();
        int lowestGrade = grade;
        int highestGrade = grade;
        int min = lowestGrade;
        int max = highestGrade;

        for(int i = 0; i <= students; i++){
            System.out.print("Enter the Student's grades: ");
            int grades = input.nextInt();
            if(grades > highestGrade){
                highestGrade = grades;
            } else if (grades < lowestGrade) {
                lowestGrade = grades;
            }
        }
        System.out.println("Highest student grade is: " + highestGrade);
        System.out.println("Lowest student grade is: " + lowestGrade);

    }
}