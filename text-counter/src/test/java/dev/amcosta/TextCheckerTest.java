package dev.amcosta;

import org.junit.Assert;
import org.junit.Test;

public class TextCheckerTest {
    @Test
    public void testCountCharacters() {
        TextChecker checker = new TextChecker("Fulano");
        Assert.assertEquals(6, checker.countCharacters().intValue());
    }

    @Test
    public void testCountWords() {
        TextChecker checker = new TextChecker("Subindo a montanha, sem fazer manha\n");
        Assert.assertEquals(6, checker.countWords().intValue());
    }

    @Test
    public void testCharacterRecorrency() {
        TextChecker checker = new TextChecker("skynet");
        Assert.assertEquals(6, checker.countCharacterRecorrency().size());
    }
}
