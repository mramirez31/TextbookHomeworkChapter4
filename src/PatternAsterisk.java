/**
 * @Class: PatternAsterisk
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 section 05, spring 2023
 * @Written: March 14, 2023
 * @Description: This program will create a pattern of asterisk for six rows.
 */
public class PatternAsterisk {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            for(int j = i; j <= 6; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
