package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void oneMonthCalendar(int totalDays, int startDay){
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
                if (row == 7 || dayCount > totalDays){
                    System.out.print("\n");
                    row = 0;}
            }
        }
    }

    public static long[] lcg(long input){
        int m = 2;
        int c = 12345;
        int a = 1103515245;
        long[] output = {1,2,3,4,5,6,7,8,9,10};
        long outputs = input;
        for(int i = 1; i < 31; i++)
            m *= 2;
        for(int j = 0; j < 10; j++){
            outputs = (outputs * a + c) % m;
            output[j] = outputs;
        }
        return output;
    }

    public static void guessingGame(int numberToGuess){
        int guessCounter = 1;
        int userGuess;
        Scanner numberUser = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.print("Guess number " + guessCounter + ": ");
            userGuess = numberUser.nextInt();
            if (userGuess == numberToGuess){
                System.out.println("You won wisenheimer!");
                return;}
            else{
                if(guessCounter == 10){
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    return;}
                if(userGuess > numberToGuess){
                    System.out.println("The number AI picked is lower than your guess.");}
                else{
                    System.out.println("The number AI picked is higher than your guess.");}
                guessCounter ++;
            }
        }
    }
    public static int randomNumberBetweenOneAndHundred(){
        Random number = new Random();
        return number.nextInt(100) + 1;
    }
    public static boolean swapArrays(int [] array1, int [] array2){
        if (array1.length == array2.length){
            int variable;
            for(int i = 0; i < array1.length; i++){
                variable = array1[i];
                array1[i] = array2[i];
                array2[i] = variable;}
            return true;}
        else{
            return false;}
    }
    public static String camelCase(String input){
        char[] charArray = input.toCharArray();
        StringBuilder inputOutput = new StringBuilder();

        if(charArray[0] >= 97 && charArray[0] <= 122)
            charArray[0] -= 32;

        for(int i = 1; i < charArray.length; i++){
            if(charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;}
            else if(charArray[i] == 32){
                i++;
                if(charArray[i] >= 97 && charArray[i] <= 122){
                    charArray[i] -= 32;}
            }
        }
        for(char j : charArray){
            if(j >= 65 && j <= 90 || j >= 97 && j <= 122)
                inputOutput.append(j);
        }
        return inputOutput.toString();
    }
    public static int checkDigit (int[] input){
        int sum = 0;
        int controlDigit;
        for(int i = 0; i < input.length; i++){
            input[i] = input[i] * (i + 2);
            sum += input[i];
        }
        controlDigit = 11 - (sum % 11);
        if(controlDigit == 10)
            controlDigit = 0;
        else if(controlDigit == 11)
            controlDigit = 5;

        return controlDigit;
    }

    // Implement all methods as public static

    public static void main(String[] args) {

        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}