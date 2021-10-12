package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count to: ");
        String inputNumber=scanner.next();
        int number=Integer.decode(inputNumber);
        for (int i=1;i<=number;i++) {
            System.out.printf("%d ",i);
        }


    }
}
