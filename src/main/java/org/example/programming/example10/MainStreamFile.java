package org.example.programming.example10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainStreamFile {
    public static void main(String[] args) {

        Path path = Paths.get("parrafo.txt");

        try (Stream<String> lineas = Files.lines(path)) {
            lineas.forEach(linea -> {
                System.out.println("Linea ..");
                System.out.println(linea);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
