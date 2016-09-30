package tools.word_counter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WordCounterTest {

    private static final String WORD1 = "Guitar";

    private final WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldBeAbleToAddOneNewWord() {
        wordCounter.addWord(WORD1);

        assertThat(wordCounter.checkIfWordExists(WORD1)).isTrue();
    }
}