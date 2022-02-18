package com.company;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1 = number.nextInt();
        System.out.println("Enter Num2 : ");
        int num2 = number.nextInt();
        System.out.println("Select Operator : ");
        char op = number.next().charAt(0);
        int r = 0;
        if (op == '+') {
            r = num1 + num2;
        }
        if (op == '-') {
            r = num1 - num2;
            System.out.println("Output is : " + r);
        }
        if (op == '*') {
            r = num1 * num2;
            System.out.println("Output is : " + r);
        }
        if (op == '/' ) {
            r = num1 / num2;
            System.out.println("Output is : " + r);
        }
        if (op == '%') {
            r = num1 % num2;
            System.out.println("Output is : " + r);
        }

    }


}
