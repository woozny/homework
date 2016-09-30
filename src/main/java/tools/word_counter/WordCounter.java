package tools.word_counter;

import java.util.ArrayList;
import java.util.List;

public class WordCounter {

    private List<String> wordList;

    public WordCounter() {
        wordList = new ArrayList<>();
    }

    public void addWord(String word) {
        wordList.add(word);
    }

    public boolean checkIfWordExists(String word) {
        return wordList.contains(word);
    }

    public int getNumberOfWordOccurrances(String word) {
        return 0;
    }
}
