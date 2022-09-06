/*Comparing my own code versous Sir Conrad's, you can see that he added an "input.nextDouble();" variable rather than running an actual multiplication operation 
inside the code which makes it so much easier to do multiplication with just a single line of code and frees up a lot of time and may even be supported by APIs.*/

import java.util.Scanner;
public class PHPtoUSD {

    public static void main(String[] Strings) {

        double dollar = 57.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value in Philippine Peso: ");

        double php = input.nextDouble();

        double dollars = php / dollar;
        System.out.println(php + " PHP is " + dollars + " USD");
    }
}
