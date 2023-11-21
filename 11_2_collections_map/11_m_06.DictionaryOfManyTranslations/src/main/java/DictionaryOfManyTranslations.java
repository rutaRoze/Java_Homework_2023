import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationList;

    public DictionaryOfManyTranslations() {
        this.translationList = new HashMap<>();
    }

    public void add(String word, String translation) {
        translationList.putIfAbsent(word, new ArrayList<>());
        translationList.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return translationList.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        translationList.remove(word);
    }
}
