import java.util.Scanner;

/**
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test
 * your understanding of formatting output using printf. Every line of input will contain a String followed by an
 * integer. Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive
 * range from 0 to 999.
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly  characters.
 * The second column contains the integer, expressed in exactly  digits; if the original input has less than
 * three digits, you must pad your output's leading digits with zeroes.
 */


public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String text = sc.next();
            int number = sc.nextInt();
            System.out.printf("%-13s %03d %n", text, number);
        }
        System.out.println("================================");

    }
}
