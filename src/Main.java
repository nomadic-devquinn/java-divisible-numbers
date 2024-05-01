import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Programming Exercise Using if else
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number : ");
        int number = scanner.nextInt();
        boolean isTrue = ((number%5)==0) || ((number%3)==0);
        if (isTrue == true) {

            if ((number % 5) == 0) {
                System.out.print("Fizz");
            }
            if ((number % 3) == 0) {
                System.out.println("Buzz");
            }
        }
        else {
            System.out.println(number);
        }
    }
}