package model;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String meaning) {
        dictionary.put(word.toLowerCase(), meaning);
    }

    public String searchWord(String word) {
        return dictionary.get(word.toLowerCase());
    }
}
