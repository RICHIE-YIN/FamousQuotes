package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {

    static Scanner scanner = new Scanner(System.in);
    static String[] quotes = new String[10];

    public static void main(String[] args) {
        quotes[0] = "Quote ONE";
        quotes[1] = "Quote TWO";
        quotes[2] = "Quote THREE";
        quotes[3] = "Quote FOUR";
        quotes[4] = "Quote FIVE";
        quotes[5] = "Quote SIX";
        quotes[6] = "Quote SEVEN";
        quotes[7] = "Quote EIGHT";
        quotes[8] = "Quote NINE";
        quotes[9] = "Quote TEN";

        call();

    }
    public static void call() {
        System.out.println("Choose a number between 1 - 10");
        int answer = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for(int i = 0; i < quotes.length; i++) {
            if(answer >= 1 && answer <= 10) {
                System.out.println(quotes[answer - 1]);
                counter++;
                break;
            }
        }
        if(counter == 0){
            System.out.println("Number out of range");
        }
    }
}
