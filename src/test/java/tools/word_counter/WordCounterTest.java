package tools.word_counter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WordCounterTest {

    private static final String WORD1 = "Guitar";
    private static final String WORD2 = "Strings";
    private static final String WORD3 = "Amplifier";

    private final WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldBeAbleToAddOneNewWord() {
        wordCounter.addWord(WORD1);

        assertThat(wordCounter.checkIfWordExists(WORD1)).isTrue();
    }

    @Test
    public void shouldBeAbleToAddMoreThanOneWord() {
        wordCounter.addWord(WORD1);
        wordCounter.addWord(WORD2);
        wordCounter.addWord(WORD3);

        assertThat(wordCounter.checkIfWordExists(WORD1)).isTrue();
        assertThat(wordCounter.checkIfWordExists(WORD2)).isTrue();
        assertThat(wordCounter.checkIfWordExists(WORD3)).isTrue();

    }
}