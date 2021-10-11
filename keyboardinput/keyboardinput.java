package week1.keyboardinput;
import java.util.Scanner;
public class keyboardinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. What is your name?\n");
        String username=scanner.next();
        System.out.printf("Hi! %s! How old are you?\n",username);
        System.out.printf("So you're %s, eh?  That's not old at all!\n",scanner.next());
        System.out.printf("How much do you make, %s?\n",username);
        System.out.printf("%s!  I hope that's per hour and not per year! LOL!",scanner.next());


    }
}
