import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.print("Введите текст для вывода статистики: ");
        String text = scanner.next();
        String[] words = text.split(" ");
        System.out.println("В тексте " + words.length + " слов");
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (counterMap.containsKey(word)) {
                int value = counterMap.get(word);
                value++;
                counterMap.put(word, value);
            } else {
                counterMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : counterMap.entrySet()) {
            System.out.println(stringIntegerEntry);

        }
    }
}