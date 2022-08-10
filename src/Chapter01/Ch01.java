package Chapter01;

import java.text.DecimalFormat;

public class Ch01 {

    public static final int RUNNING_METS = 10;
    public static final int BASKETBALL_METS = 8;
    public static final int SLEEPING_METS = 1;

    public static void main(String[] args) {

        double pounds = 150;
        double kilo = 2.2;
        double weight = pounds / kilo;

        double runCalories = 0.0175 * RUNNING_METS * weight * 30;
        double bbCalories = 0.0175 * BASKETBALL_METS * weight * 30;
        double sleepCalories = 0.0175 * SLEEPING_METS * weight * (6 * 60);

        double totalCalories = runCalories + bbCalories + sleepCalories;
        DecimalFormat result = new DecimalFormat(".00");

        System.out.println("The total number of calories burned is " + result.format(totalCalories));

        System.out.println("\nQuestion 2");
        int candyBar = 10;
        int gumBall = 3;
        int numberOfCoupons = 25;

        System.out.println("Number of coupons: " + numberOfCoupons);
        System.out.println("Number of candy bars: " + numberOfCoupons / candyBar); // 25/10 = 2
        System.out.println("Number of gum balls: " + (numberOfCoupons % candyBar) / gumBall); // 5/3 = 1
        System.out.println("Unused coupons: " + (numberOfCoupons % candyBar) % gumBall);

        System.out.println("\nQuestion 3");
        String first = "walt";
        String last = "savitch";

        first = first.substring(1, 2).toUpperCase() + first.substring(2) + first.substring(0, 1) + "ay";
        last = last.substring(1, 2).toUpperCase() + last.substring(2) + last.substring(0, 1) + "ay";

        String fullName = first + " " + last;
        System.out.println(fullName);

        System.out.println("\nQuestion 4");

        double sweetnerNeededToKillInGrams = 32;
        double weightOfMouseInGrams = 20;
        int startingWeight = 230;
        int desiredWeight = 175;
        double dietSodaContains = 0.001;

        sweetnerNeededToKillInGrams /= 453.593;
        weightOfMouseInGrams /= 453.593;
        double friend = (sweetnerNeededToKillInGrams / weightOfMouseInGrams) * desiredWeight;
        double sodaPop = friend / dietSodaContains;
        System.out.println("It would take " + sodaPop + " soda pop to kill");


        System.out.println("\nQuestion 5");
        String sentence = "I hate you.";
        System.out.println("Original sentence:\n" + sentence);

        int position = sentence.indexOf("hate");
        // System.out.println(position); // position is assigned index 2
        String end = sentence.substring(position + "hate".length());
        // System.out.println(end); // end is assigned _you.
        sentence = sentence.substring(0, position) + "love" + end;
        System.out.println("Modified sentence: \n" + sentence);K

    }
}
