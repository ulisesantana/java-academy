package ulises.utils;

import java.util.Scanner;

public class IO {

    public static void println(String message) {
        System.out.println(message);
    }

    public static String readText(String message) {
        IO.println(message);
        return new Scanner(System.in).nextLine();
    }

    public static int readInt(String message) {
        IO.println(message);
        return new Scanner(System.in).nextInt();
    }
}
