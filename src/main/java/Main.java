/*
* UCF COP 3330 Fall 2021 Assignment 13
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        Scanner compound = new Scanner(System.in);
        System.out.println("What is the principal amount? ");
        int p = Math.round(compound.nextFloat());

        System.out.println("What is the rate? ");
        double r = compound.nextFloat();
        double r1=r;
        r = r/100;

        System.out.println("What is the number of years? ");
        int y = compound.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        int annual = compound.nextInt();

        double x = Math.pow((1 + (r/annual)), (annual*y));
        double amount = p * x;

        System.out.printf("$%d is invested at %.1f for %d years compounded %d times per year is %.2f", p, r1, y, annual, amount);
    }
}