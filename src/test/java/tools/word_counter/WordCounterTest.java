package tools.word_counter;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class WordCounterTest {

    private static final String WORD1 = "Guitar";
    private static final String WORD2 = "Strings";
    private static final String WORD3 = "Amplifier";

    private WordCounter wordCounter;

    @Before
    public void init() {
        wordCounter = new WordCounter();
    }

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

    @Test
    public void shouldBeAbleToReceiveNumberOfOccurrencesForSingleWord() {
        wordCounter.addWord(WORD1);
        wordCounter.addWord(WORD1);

        assertThat(wordCounter.getNumberOfWordOccurrences(WORD1)).isEqualTo(2);
    }

    @Test
    public void shouldProvideWordAndNumberOfOccurrences() {
        assertThat(wordCounter.addWordAndReturnAmountOfItsOccurrences(WORD1)).isEqualTo(WORD1 + " -> " + "1");
        assertThat(wordCounter.addWordAndReturnAmountOfItsOccurrences(WORD1)).isEqualTo(WORD1 + " -> " + "2");
        assertThat(wordCounter.addWordAndReturnAmountOfItsOccurrences(WORD1)).isEqualTo(WORD1 + " -> " + "3");

    }
}