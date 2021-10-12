package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("I will add up the numbers you give me.\n");
        int ttnumber=0;
        System.out.print("Number: ");
        String inputNumber=scanner.next();
        int number=Integer.decode(inputNumber);
        while (number != 0)
        {
            ttnumber=ttnumber+number;
            System.out.printf("The total so far is %d.\n",ttnumber);
            System.out.print("Number: ");
            inputNumber=scanner.next();
            number=Integer.decode(inputNumber);


        }
        System.out.printf("\nThe total is %d.",ttnumber);


    }
}
