package Chapter01;

public class FirstProgram {

    public static void main(String[] args) { // Begin the program named FirstProgram
        System.out.println("Hello reader."); // Output what is shown in the parenthesis
        System.out.println("Welcome to Java!");

        // System.out is an object used for sending output to the screen
        // println is the method (that is, the action) that this object performs.
        System.out.println("Let's demonstrate a simple calculation.");
        int answer;
        answer = 2 + 2;
        System.out.println("2 + 2 is " + answer);
    }
}

/*
What is a compiler?
A compiler translates a code into a low-level language. When you compile a java program, the
compiler translates your code into a program expressed in java bytecode.

What is a source program?
The program that is input to a compiler.

What is an object?
The translated program that is produced by the compiler.

What you call the program that runs Java byte-code instructions?
Program that runs java byte-code instructions is called an interpreter. It is often called a JVM.

You define a class named NiceClass in a file. What name should the file have?
NiceClass.java

You compile the class NiceClass. What will be the name of the file with resulting byte-code?
NiceClass.class
 */
