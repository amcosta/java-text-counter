package dev.amcosta;

import java.util.HashMap;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
        String text = "Alex Moreno da Costa";
        Map<String, Integer> textCounter = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            String character = String.valueOf(text.charAt(i)).toLowerCase();
            if (character.equals(" ")) {
                continue;
            }

            Integer counter = 0;
            if (textCounter.get(character) != null) {
                counter = textCounter.get(character);
            }

            counter++;
            textCounter.put(character, counter);
        }

        textCounter.forEach((character, quantity) -> System.out.println(String.format("%s: %d", character, quantity)));
    }
}
