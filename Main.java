import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Yellow", "Black", "Green", "Red", "Green", "Blue", "Yellow", "Red", "Red", "Pink", "Yellow"};
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word,1);
            }
        }
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество повторений: " + wordCount);
    }
}