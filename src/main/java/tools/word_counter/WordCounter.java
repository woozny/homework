package tools.word_counter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private static final int WORD_ADDED_FIRS_TIME = 1;

    private Map<String, Integer> wordList;

    public WordCounter() {
        wordList = new HashMap<>();
    }

    public void addWord(String word) {
        if (checkIfWordExists(word)) {
            incrementNumberOfOccurrences(word);
        } else {
            wordList.put(word, WORD_ADDED_FIRS_TIME);
        }
    }

    public boolean checkIfWordExists(String word) {
        return wordList.containsKey(word);
    }

    private void incrementNumberOfOccurrences(String word) {
        int numberOfOccurrences = getNumberOfWordOccurrences(word);
        wordList.put(word, ++numberOfOccurrences);
    }

    public int getNumberOfWordOccurrences(String word) {
        return wordList.get(word);
    }

    public String addWordAndReturnAmountOfItsOccurrences(String word) {
        StringBuilder wordAndOccurrence = new StringBuilder();
        addWord(word);
        wordAndOccurrence.append(word).append(" -> ").append(getNumberOfWordOccurrences(word));

        return String.valueOf(wordAndOccurrence);


    }


}
