import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1------------------------------------------------------------------------------
        List<String> str = new ArrayList<>(Arrays.asList("Dog", "CPU", "Cat", "PLC", "Maus",
                "Cat", "CPU", "Aple", "Vasja", "Luntik"));
        Set<String> str2 = new HashSet<>();
        for (String S : str) {
            str2.add(S);
        }
        System.out.print("Исходный список: ");
        System.out.println(str);
        System.out.print("Список с уникальными словами: ");
        System.out.println(str2);

        //Подсчет элементов
        Map<String, Integer> map = new HashMap<>();
        for (String S: str) {
            map.put(S, map.getOrDefault(S, 0) + 1);
        }
        System.out.print("Подсчет элементов: ");
        System.out.println(map);

        //Задание 2------------------------------------------------------------------------------
        PhoneBook book = new PhoneBook();
        book.put("Петренко", "+79185566485");
        book.put("Попугайло", "+79885423123");
        book.put("Иванов", "+79114238954");
        book.put("Пяточков", "+78115236484");
        book.put("Иванов", "+75623584521");
        book.put("Попугайло", "+75862314877");
        book.put("Иванов", "+77568956677");

        book.get("Попугайло");
        book.get("Петренко");
        book.get("Иванов");

    }
}
