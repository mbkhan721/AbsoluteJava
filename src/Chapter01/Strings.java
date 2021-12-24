package Chapter01;

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

    }
}

// Left work at page 39 toLowerCase()




