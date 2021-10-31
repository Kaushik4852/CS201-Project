package com.company;

public class AccountNoGenerate {
    public static void main(String[] args) {
        System.out.println(" ");
    }
    static int randomGenerate(){
        return (int)(Math.random()*10000);
    }
    public String accNo(){
        int first = randomGenerate();
        int second = randomGenerate();
        int third = randomGenerate();
        int forth = randomGenerate();
        if (first < 1111){
            first += 1111;
        }
        if (second < 1111){
            second += 1111;
        }
        if (third < 1111){
            third += 1111;
        }
        if (forth < 1111){
            forth += 1111;
        }
        String n1 = Integer.toString(first);
        String n2 = Integer.toString(second);
        String n3 = Integer.toString(third);
        String n4 = Integer.toString(forth);
        return (n1+ " " + n2 + " "+ n3 + " " + n4);
    }


}
