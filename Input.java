package com.company;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        System.out.println(" ");
    }

    public static String name(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Your Name : ");
//        String name = input.nextLine();
        return input.nextLine();
    }

    public static String mobileNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Mobile Number(First Five Digit) : ");
        int first5 = input.nextInt();
        System.out.print("\nEnter Mobile Number(Last Five Digit) : ");
        int last5 = input.nextInt();
        String m1 = Integer.toString(first5);
        String m2 = Integer.toString(last5);
//        String s = Integer.toString((int)(Math.random()*1001));
//        String moNum = m1 + m2;
        return  m1 + m2;
    }

    public static String birth(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Birth Date : ");
        int date = input.nextInt();
        System.out.print("\nEnter Birth Month(XX) : ");
        int month = input.nextInt();
        System.out.print("\nEnter Birth Date : ");
        int year = input.nextInt();
        String m1 = Integer.toString(date);
        String m2 = months(month);
        String m3 = Integer.toString(year);
        return (m1 + " " + m2 + " " + m3);
    }

    static String months(int a){
        if (a == 1){
            return "Januatry";
        }
        else if(a == 2){
            return "February";
        }
        else if (a == 3){
            return "March";
        }
        else if(a == 4){
            return "April";
        }
        else if(a == 5){
            return "May";
        }
        else if(a == 6){
            return "June";
        }
        else if(a == 7){
            return "July";
        }
        else if(a == 8){
            return "August";
        }
        else if(a == 9){
            return "September";
        }
        else if(a == 10){
            return "October";
        }
        else if(a == 11){
            return "November";
        }
        else if (a == 12){
            return "December";
        }
        return "Month";
    }
}
