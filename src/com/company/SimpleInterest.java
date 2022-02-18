package com.company;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter P, R, T: ");
        float P = input.nextInt();
        float R = input.nextInt();
        float T = input.nextInt();


        float Calcu = (  P * R * T );
        float I = Calcu;
        System.out.println("Simple Interest is: " + I);
    }
}
// I = PRt where I = interest, P = principal, R = rate, and t = time.