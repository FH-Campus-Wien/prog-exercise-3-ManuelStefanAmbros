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

    static long lcg(long input){
        int m = 2;
        int c = 12345;
        int a = 1103515245;
        for(int i = 1; i < 31; i++)
            m *= 2;
        return (input * a + c) % m;
    }

    static void guessingGame(int numberToGuess){
        int numberAI = randomNumberBetweenOneAndHundred();
        int guessCounter = 1;
        int userGuess = -1;
        Scanner numberUser = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.print("Guess number " + guessCounter + ": ");
            userGuess = numberUser.nextInt();
            if (userGuess == numberAI){
                System.out.println("You won wisenheimer!");
                return;}
            else{
                if(guessCounter == 10){
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    return;}
                if(userGuess > numberAI){
                    System.out.println("The number AI picked is lower than your guess.");}
                else{
                    System.out.println("The number AI picked is higher than your guess.");}
                guessCounter ++;
            }
        }
    }
    static int randomNumberBetweenOneAndHundred(){
        Random number = new Random();
        return number.nextInt(100);
    }

    // Implement all methods as public static

    public static void main(String[] args) {

        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}