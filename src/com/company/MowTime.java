package com.company;

import java.util.Scanner;

public class MowTime {

    public static void main(String[] args) {
	// write your code here
        double length,width, squareYard, mowTime;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the lawn width in yards.");
        width=scan.nextDouble();
        System.out.print("Enter the lawn length in yards.");
        length=scan.nextDouble();

        squareYard = width*length;
         mowTime=(squareYard*2)/40;

         System.out.println("Length: "+length);
         System.out.println("Width: "+width);
         System.out.println("Square Yardage: "+squareYard);
         System.out.println("Mow time: "+mowTime+" minutes");

    }
}
