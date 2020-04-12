package Lesson_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Phonebook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void add(String surname, String telephone) {
        phoneBook.put(telephone, surname);
    }

    public ArrayList<String> get(String surname) {
        ArrayList<String> telephoneArray = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = phoneBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entrySet = iterator.next();
            if (entrySet.getValue().equals(surname)) telephoneArray.add(entrySet.getKey());
        }
        System.out.print(surname + " : ");
        return telephoneArray;
    }
}
