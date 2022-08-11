package Chapter02;

/* Packages are java libraries of classes. Import statements make classes from a package
available to your program.
System.out is an object that is part of java language, and println is a method invoked
by that object.
*/

public class ScreenOutput {
    public static void main(String[] arg) {

        String s = "Hello" + "joe";
        System.out.println(s);

        double price = 19.8;
        System.out.print("$");
        System.out.printf("%6.2f", price); // first argument is known as format specifier
        System.out.println(" each");
        // Or
        System.out.printf("$%6.2f each", price); // % signals the end of output and start of the format specifier.
                                                // the end of a format specifier is indicated by a conversion
                                                // character (f in our example).


    }
}
// start at top of page 63