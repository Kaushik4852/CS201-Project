package com.company;

import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static String randomStr(){
        int leftLimit = 65;  // letter 'A'
        int rightLimit = 90;  // letter 'Z'
        int strLength = 5;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(strLength);
        for (int i = 0; i < strLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char)randomLimitedInt);
        }
//        String generatedString = buffer.toString();
        return buffer.toString();
//        System.out.println(generatedString);
    }





    public static void main(String[] args) {

        Input form = new Input();
        Scanner input = new Scanner(System.in);
//        FindAccount logIn = new FindAccount();

        /* If Already Have An Account */
//        System.out.print("Already Have An Account (Enter 1 for Proceed and 0 for Ending) : ");
//        int opt = input.nextInt();
//        if (opt == 1){
//            logIn.login();
//        }

        String name = form.name();
        String moNum = form.mobileNumber();
        String bDate = form.birth();
        String s = Integer.toString((int)(Math.random()*1001));


        AccountNoGenerate accountNumber = new AccountNoGenerate();
        String accNo = accountNumber.accNo();

        String userName = randomStr() + s ;
        System.out.print("\nYour Account Number Is : " + accNo);
        System.out.print("\nYour User Name Is : " + userName);

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\ratho\\OneDrive\\Desktop\\CS201 Group Project\\Users\\" + userName +  ".txt");
            fileWriter.write("Name : " + name + "\n" +
                            "Mobile Number : " + moNum + "\n" +
                    "Account Number : " + accNo + "\n" +
                            "Birth Date : " + bDate +

                                 "\n-------------------------------------------------------------------"
                                                 );
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("Something Went Wrong");
            e.printStackTrace();
        }
    }
}