import java.util.*;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Введите текст для вывода статистики: ");
        String text = scanner.next();
        List<String> textList;
        textList = Arrays.asList(text.split(" "));
        sort(textList);
        System.out.println("В тексте " + textList.size() + " слов");
        Map<String, Integer> counterMap = new LinkedHashMap<>();
        for (String word : textList) {
            if (counterMap.containsKey(word)) {
                int value = counterMap.get(word);
                value++;
                counterMap.put(word, value);
            } else {
                counterMap.put(word, 1);
            }
        }
        List<Map.Entry<String, Integer>> wordsList = new LinkedList<>(counterMap.entrySet());
        wordsList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        for (Map.Entry<String, Integer> word : wordsList){
            System.out.println(word.getValue() + " - " + word.getKey());
        }
    }
}