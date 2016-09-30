package tools.word_counter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private static final int WORD_ADDED_FIRS_TIME = 1;

    private Map<String, Integer> wordList;

    public WordCounter() {
        wordList = new HashMap<>();
    }

    public String addWordAndReturnAmountOfItsOccurrences(String word) {
        addWord(word);

        return prepareStringWithWordAndOccurrence(word);
    }


    void addWord(String word) {
        if (checkIfWordExists(word)) {
            incrementNumberOfOccurrences(word);
        } else {
            wordList.put(word, WORD_ADDED_FIRS_TIME);
        }
    }

    boolean checkIfWordExists(String word) {
        return wordList.containsKey(word);
    }

    private void incrementNumberOfOccurrences(String word) {
        int numberOfOccurrences = getNumberOfWordOccurrences(word);
        wordList.put(word, ++numberOfOccurrences);
    }

    private String prepareStringWithWordAndOccurrence(String word) {
        return word + " -> " + getNumberOfWordOccurrences(word);
    }

    int getNumberOfWordOccurrences(String word) {
        return wordList.get(word);
    }
}
