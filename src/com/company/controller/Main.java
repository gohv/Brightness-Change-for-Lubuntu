package com.company.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting app");
        System.out.print("Please enter the wanted brightness: ");
        boolean continueLoop = true;
        do{
        try {
             int brightness = scanner.nextInt();
                System.out.println("Please do not use values less than 50 or bigger than 1000");
                System.out.print("Please enter the wanted brightness: ");
                brightness = scanner.nextInt();
                //A simple checker so that no one uses a very large number
                if(brightness > 50 && brightness < 1000){
                String setBrightness = "echo applet| sudo -S echo "+ brightness + " > /sys/class/backlight/intel_backlight/brightness";
                continueLoop = false;
                String[] cmd = {"/bin/bash","-c",setBrightness};
                Process pb = Runtime.getRuntime().exec(cmd);
                }else{
                    System.out.println("Invalid value! Please do not use values less than 50 or bigger than 1000");
                }

        } catch (InputMismatchException e) {
            System.out.println("Only Numbers please:");
            scanner.nextLine();
        }

        }while (continueLoop);


/*        String line;
        BufferedReader input = new BufferedReader(new InputStreamReader(pb.getInputStream()));
        while ((line = input.readLine()) != null) {
            System.out.println("root successful!");
        }
        String error;
        BufferedReader errorInput = new BufferedReader(new InputStreamReader(pb.getErrorStream()));
        while ((error = errorInput.readLine()) != null) {

            System.out.println("Successful");
        }
        input.close();*/


    }
}
