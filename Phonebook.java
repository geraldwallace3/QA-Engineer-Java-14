import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phonebook;
    public Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add (String lastName, String phoneNumber) {
        if (phonebook.containsKey(lastName)) {
            List<String> phoneNumbers = phonebook.get(lastName);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(lastName,phoneNumbers);
        }
    }
    public List<String> get(String lastName) {
        return phonebook.get(lastName);
    }
}
