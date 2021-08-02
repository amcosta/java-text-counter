package dev.amcosta;

import java.util.HashMap;
import java.util.Map;

public class TextChecker {
    String text;

    public TextChecker(String text) {
        this.text = text;
    }

    public Integer countWords() {
        return text.split("\s").length;        
    }

    public Integer countCharacters() {
        return text.length();
    }

    public Map<String, Integer> countCharacterRecorrency() {
        Map<String, Integer> textCounter = new HashMap<>();
        String localText = text.toLowerCase();

        for (int i = 0; i < localText.length(); i++) {
            String character = String.valueOf(localText.charAt(i));
            Integer counter = 0;

            if (character.equals(" ")) {
                character = "whitespace";
            }

            if (textCounter.get(character) != null) {
                counter = textCounter.get(character);
            }

            counter++;
            textCounter.put(character, counter);
        }

        return textCounter;
    }
}
