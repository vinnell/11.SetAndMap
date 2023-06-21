import java.util.*;

public class Main {
    public static void main(String[] args) {
        // There is a line with text in English. Highlight all unique words.
        // Words that differ only in case of letters are considered the same.

        String line = "Good night mother, good night father, Kiss your little son. Good night sister, Good night brother, Good night everyone";
        String[] words = line.replaceAll("\\W", " ").split(" ");

        Set<String> wordList = new HashSet<>();
        for (String word : words) {
            int count = 0;
            for (String s : words) {
                if (word.equalsIgnoreCase(s))
                    count++;
            }
            if (count == 1)
                wordList.add(word);
        }
        System.out.println(line + "\nall unique words with ignore case:\n" + wordList);

        // There is a line with text in English. Highlight all unique words.
        //For each word, calculate the frequency of its occurrence in the text. Words that differ in case of letters, be considered different.
        String line1 = "Good night mother, good Night father, Kiss your little son. Good night sister, Good night brother, Good night everyone";
        String[] str = line1.replaceAll("\\W", " ").split(" ");

        Map<String, Integer> map = new HashMap<>();
        for(String s: str) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }
            else {
                map.put(s, 1);
            }
        }
        map.remove("");
        System.out.println("\n" + line1 + "\nall unique words with frequency of its occurrence:\n" + map);
        }
    }
