package Chapter01;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        String greeting = "Hello";
        int count = greeting.length();
        System.out.println("Length is " + count);
        // Or
        System.out.println("Length is " + greeting.length());

        System.out.println("\nHello equals hello? " + greeting.equals("hello"));

        String name = "mary!";
        System.out.println("\nmary equalsIgnoreCase Mary? " + name.equalsIgnoreCase("Mary!"));

        String greet = "Hi Mary!";
        System.out.println("\nPrinting greet in all lower case: " + greet.toLowerCase(Locale.ROOT));

        String pause = " Hmm ";
        System.out.println("\nString trim() removes leading and trailing white space:" + pause.trim());

        System.out.println("\ncharAt(0): " + greeting.charAt(0));
        System.out.println("charAt(1): " + greeting.charAt(1));

        String sample = "AbcdefG";
        System.out.println("\nsubstring(start): " + sample.substring(2));
        System.out.println("substring(start, end): " + sample.substring(2, 5));

        System.out.println("\nindexOf(first occurrence): " + greet.indexOf("Mary"));
        System.out.println("indexOf(first occurrence): " + greet.indexOf("Sally"));

        System.out.println("\nlastIndexOf(Hi Mary!): " + greet.lastIndexOf("r"));

        String myName = "Muhammad";
        myName = myName + " Khan";
        System.out.println("\n" + myName);
    }
}





