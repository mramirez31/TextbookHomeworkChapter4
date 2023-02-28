/**
 * @Class: StudentGrades
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: February 23, 2023
 *
 * @Description: This program will prompt for the user to enter their grades
 * and a character to tell the program to stop after it calculates the grades and
 * the program will then give a result of their grade in  the total average grade in the class.
 */

import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students: ");
        int students = input.nextInt();
        double sum = 0;
        for(int count = 1; count <= students; count++){
            if(count <= students){
                System.out.println("please enter the students grades: ");
                double grade = input.nextDouble();
                sum = sum + grade;
            }
            System.out.println("The class average is " + sum / students);
        }


    }
}