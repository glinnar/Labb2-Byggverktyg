package se.Iths;

public class TextProcessor {


    public String upperCase(String text) {

        return text.toUpperCase();

    }

    public String lowerCase(String text) {

        return text.toLowerCase();
    }

    public StringBuilder reverse(String text) {
        StringBuilder builder = new StringBuilder(text);

        return builder.reverse();


    }
}
