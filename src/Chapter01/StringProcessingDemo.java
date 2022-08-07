package Chapter01;

public class StringProcessingDemo {
    public static void main(String[] args) {

        String sentence = "I hate text processing!";
        int position = sentence.indexOf("hate");
        String ending = sentence.substring(position + "hate".length());

        System.out.println("01234567890123456789012");
        System.out.println(sentence);
        System.out.println("The word \"hate\" starts at index " + position);
        sentence = sentence.substring(0, position) + "adore" + ending;
        System.out.println("The change string is:");
        System.out.println(sentence + "\n");

        String sentence_b = "I am from Shahmansoor and I have been living in the US since 2001.";
        int position_b = sentence_b.indexOf("U");
        String end = sentence_b.substring(position_b + "US".length());

        System.out.println(sentence_b);
        System.out.println("The word \"U\" starts at index " + position_b);
        sentence_b = sentence_b.substring(0, position_b) + "United States" + end;
        System.out.println(sentence_b);

    }
}
