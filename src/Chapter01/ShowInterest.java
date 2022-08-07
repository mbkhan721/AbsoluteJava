package Chapter01;

public class ShowInterest {

    public static final double INTEREST_RATE = 2.5;

    public static void main(String[] args) {

        double balance = 100;
        double interest; // as a percent

        interest = balance * (INTEREST_RATE / 100);

        System.out.println("On a balance of $" + balance);
        System.out.println("You'll earn interest of $" + interest + " per year.");
    }

}
