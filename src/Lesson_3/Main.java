package Lesson_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ---- First part of Home Task
        String[] array = {"one", "two", "three", "four", "five", "six", "one", "two", "seven", "eight", "nine", "ten", "one", "four", "one", "two", "eleven", "twelve", "thirteen", "fourteen"};
        List<String> arrayList = Arrays.asList(array);
        System.out.println(getUniqeSet(arrayList));
        countWordOccurs(arrayList);
        System.out.println("--------------------");

        // ----- Second part of Home Task
        Phonebook phonebook = new Phonebook();
        phonebook.add("Никитин", "+123456789");
        phonebook.add("Васичкин", "+987654321");
        phonebook.add("Никитин", "+147258369");
        phonebook.add("Петров", "+963852741");
        phonebook.add("Громыко", "+159753852");

        System.out.println(phonebook.get("Никитин"));
        System.out.println(phonebook.get("Петров"));
    }

    static Set<String> getUniqeSet(List<String> arrayList) {
        return new HashSet<>(arrayList);
    }

    static void countWordOccurs(List<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int wordOccurs = 0;
            for (String anArrayList : arrayList) {
                if (arrayList.get(i).equals(anArrayList)) {
                    wordOccurs++;
                }
            }
            System.out.printf("Word %s occur: %d times \n",arrayList.get(i), wordOccurs);
        }
    }

}
