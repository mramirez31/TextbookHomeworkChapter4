/**
 * @Class: FibonacciSeries
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program will print and display the first 30 numbers of the fibonacci Series
 *
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 30;
        System.out.println("The first 30 numbers in the fibonacci series are: ");

        for(int i = 0; i < c; i++){
            System.out.print(a + ", ");
            int d = a + b;
            a = b;
            b = d;
        }
    }
}
