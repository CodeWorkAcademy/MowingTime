package com.company;

import java.util.Scanner;

public class MoreMowingTime {
    public static void main(String [] args){
        double pay,actualYard,yardLength,yardWidth,houseWidth,houseLength, houseArea ,squareYard, mowTime;
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the yard width in yards.");
        yardWidth=scan.nextDouble();
        System.out.println("Enter the yard length in yards.");
        yardLength=scan.nextDouble();
        System.out.println("Enter the length of the house.");
        houseLength=scan.nextDouble();
        System.out.println("Enter the width of the house.");
        houseWidth=scan.nextDouble();

        squareYard = yardWidth*yardLength;
        houseArea=houseLength*houseWidth;
        actualYard=squareYard-houseArea;

        mowTime=(actualYard/40)*2;
        pay =mowTime*12.00;
        System.out.println("Length of yard: "+yardLength);
        System.out.println("Width width of yard: "+yardWidth);
        System.out.println("Square Yardage: "+squareYard);
        System.out.println("Length of house: "+houseLength);
        System.out.println("Width of house: "+houseWidth);
        System.out.println("Area of house: "+houseArea);
        System.out.println("Mow time: "+mowTime+" minutes");
        System.out.println("Pay for Joe at $12 an hour: $"+pay);
    }
}
