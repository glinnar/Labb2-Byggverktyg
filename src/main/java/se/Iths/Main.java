package se.Iths;

public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.Add(20, 22));
        System.out.println(cal.Sub(500, 1000));
        System.out.println(cal.Multiplication(1000, 10));
        System.out.println(cal.Division(28, 4));

        TextProcessor text = new TextProcessor();
        System.out.println(text.upperCase("yoo"));
        text.lowerCase("TJENNAA");
        System.out.println(text.reverse("Hallå"));

    }
}
