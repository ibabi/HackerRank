import java.io.*;

/* In this challenge, we're going to use loops to help us do some simple math. Given an integer N,
 print its first  multiples. Each multiple should be printed on a new line in the form: N x i = result.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d %n", number, i, i*number);
        }
    }
}
