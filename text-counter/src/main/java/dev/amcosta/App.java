package dev.amcosta;

public class App {
    public static void main( String[] args ) {
        TextChecker checker = new TextChecker("Alex Moreno da Costa");
        System.out.println("Letras: " + checker.countCharacters());
        System.out.println("Palavras: " + checker.countWords());
        checker.countCharacterRecorrency().forEach((character, quantity) -> System.out.println(String.format("%s: %d", character, quantity)));
    }
}
