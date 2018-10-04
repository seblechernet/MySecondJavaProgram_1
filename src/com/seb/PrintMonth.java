package com.seb;
import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of days in a month: " );
        int month = sc.nextInt();

        String monthName= "";
        switch (month) {
            case 31:  monthName = "January ";
                monthName += "March ";
                monthName += "May ";
                monthName += "July ";
                monthName += "October ";
                monthName += "December ";
                break;
            case 29:  monthName = "February";
                break;
            case 30: monthName = "April ";
                     monthName += "June ";
                     monthName += "August ";
                     monthName += "September ";
                     monthName += "November ";

                break;
            default: monthName = "Unknown";
                break;
        }
        System.out.println(monthName);
    }
}