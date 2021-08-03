package dev.amcosta;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o arquivo para analisar:");
        String filepath = scan.nextLine();
        List<String> lines = Files.readAllLines(Path.of(filepath));
        String text = String.join("\n", lines);
        scan.close();

        // /Users/alex.costa/Downloads/log1.txt
        TextChecker checker = new TextChecker(text);
        System.out.println("Letras: " + checker.countCharacters());
        System.out.println("Palavras: " + checker.countWords());
        checker.countCharacterRecorrency().forEach((character, quantity) -> System.out.println(String.format("%s: %d", character, quantity)));
    }
}
