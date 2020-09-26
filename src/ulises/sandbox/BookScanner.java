package ulises.sandbox;

import ulises.utils.IO;

public class BookScanner {
    public static void main(String[] args) {
        String titulo = IO.readText("Proporciona el título");
        String autor = IO.readText("Proporciona el autor");

        IO.println(titulo + " fue escrito por " + autor);
    }
}
