package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.)");
        String username=scanner.next();
        System.out.printf("Ok, %s, how old are you?",username);
        String userage=scanner.next();
        int intUserage=Integer.decode(userage);
        if (intUserage < 16)
        {System.out.printf("You can't drive, %s.",username);}
        else if (intUserage >= 16 & intUserage <=17)
        {System.out.printf("You can drive but not vote, %s.",username);}
        else if (intUserage>=18 & intUserage <=24)
        {System.out.printf("You can vote but not rent a car, %s.",username);}
        if (intUserage >= 25)
        {System.out.printf("You can do pretty much anything, %s.",username);}



    }
}
