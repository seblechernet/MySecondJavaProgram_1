package com.seb;
import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, average;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        if(sum > 200) {
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + "*");
        }else {
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }
        product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        average = product/2;
        System.out.println("The average of " + product + " is " + average);

    }
}
