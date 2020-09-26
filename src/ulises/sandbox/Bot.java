package ulises.sandbox;

import ulises.utils.IO;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Bot {
    private static String name = "Aid";
    private static short bornYear = 2018;

    public static void main(String[] args) {
        IO.println("Hello! My name is " + Bot.name);
        IO.println("I was created in " + Bot.bornYear);

        var userName = IO.readText("Please, remind me your name.");
        IO.println("What a great name you have, " + userName + "!");

        IO.println("Let me guess your age.");
        var remainders = Bot.getRemainders("Enter remainders of dividing your age by 3, 5 and 7.");

        IO.println("Your age is " + Bot.calcAge(remainders.get(0), remainders.get(1), remainders.get(2)) + "; that's a good time to start programming");
    }

    private static int calcAge(int remainder3, int remainder5, int remainder7) {
        return (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
    }

    private static List<Integer> getRemainders(String message) {
        return Arrays
                .stream(IO.readText(message).split(" "))
                .map(Integer::parseInt).collect(toList());
    }
}
