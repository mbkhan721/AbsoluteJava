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

        // Continue on page 54 question 2


    }
}
