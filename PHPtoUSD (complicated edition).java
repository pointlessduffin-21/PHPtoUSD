/*This code was a reverse engineering job done by yours truly. It's more complicated than our teacher's reference code due to its use of a manual Currency converter 
but it gets the job done and it teaches you how to make your code more efficient and easier to use. */

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value in Philippine Peso: ");
        double php = input.nextDouble();

        double usd =( 0.018 *(php));
        System.out.println(php + " pesos is equal to " + usd + " USD");
    }
}
