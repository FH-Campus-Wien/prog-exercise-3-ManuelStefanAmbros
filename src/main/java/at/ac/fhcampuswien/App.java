package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    static void oneMonthCalendar(int totalDays, int startDay){
        int dayCount = 1;
        int row = 0;

        for(int i = 1; i < startDay; i++){
            System.out.print("   ");
            row ++;}
        for(int j = 1; j <= 5; j++) {
            while(dayCount <= totalDays){
                if (dayCount < 10){
                    System.out.print(" " + dayCount + " ");}
                else{
                    System.out.print(dayCount + " ");}
                row ++;
                dayCount++;
                if (row == 7){
                    System.out.print("\n");
                    row = 0;}
            }
        }
    }

    // Implement all methods as public static

    public static void main(String[] args) {

        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}