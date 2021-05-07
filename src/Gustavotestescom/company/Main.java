package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2, number3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type some number");
        number1 = scanner.nextInt();

        System.out.println("Type a second number");
        number2 = scanner.nextInt();

        System.out.println("type a third number");
        number3 = scanner.nextInt();

        if (number1 > number2 &&  number1 > number3){
            System.out.println("The greater number is " + number1);
        }
        else if (number2 > number1  && number2 > number3){
            System.out.println("the greater number is " + number2);
        }
        else if (number3 > number1 && number3 > number2){
            System.out.println("the greater number is " + number3);
        }

         if (number1 < number2 &&  number1 < number3){
            System.out.println("The less number is " + number1);
        }
        else if (number2 < number1  && number2 < number3){
            System.out.println("the less number is " + number2);
        }
        else if (number3 < number1 && number3 < number2){
            System.out.println("the lesse number is " + number3);
        }

    }
}
