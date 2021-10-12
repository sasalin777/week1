package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello. What is your name?");
        String username=scanner.next();
        System.out.printf("Hi! %s! How old are you?",username);
        String userage=scanner.next();
        int after5y=Integer.decode(userage)+5;
        int before5y=Integer.decode(userage)-5;

        System.out.printf("Did you know that in five years you will be %d years old?\n",after5y);
        System.out.printf("And five years ago you were %d! Imagine that!",before5y);

    }
}
