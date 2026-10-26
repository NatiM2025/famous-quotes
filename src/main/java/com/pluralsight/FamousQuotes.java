package com.pluralsight;

import java.sql.Array;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "You have made us for yourself, O Lord, and our heart is restless until it rests in you.",
                "To be a Christian means to forgive the inexcusable because God has forgiven the inexcusable in you.",
                "When Christ calls a man, he bids him come and die.",
                "Worry does not empty tomorrow of its sorrow; it empties today of its strength.",
                "God never wastes a hurt.",
                "A Bible that’s falling apart usually belongs to someone who isn’t.",
                "The Bible was not given for our information but for our transformation.",
                "God is most glorified in us when we are most satisfied in him.",
                "When we work, we work; when we pray, God works.",
                "If through a broken heart God can bring His purposes to pass in the world, then thank Him for breaking your heart."
        };
       boolean exit = false;
        int userChose = 0;
        do {

            try {
                System.out.println();
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number from 1 to 10 or (0 to Exit)");
                userChose = input.nextInt();
                System.out.println(userChose + "->" + quotes[userChose - 1]);
            } catch (Exception e) {
                System.out.println("sorry Something went wrong :( ");
            }
        }while (userChose!=0);

    }

}
