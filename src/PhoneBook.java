import java.util.*;

public class PhoneBook {

    Map<String, List<String>> map = new HashMap<>();
    private List<String> s;


    public void put(String lastName, String tel) {
        if (map.containsKey(lastName)) {   //если нашли ключ
            s = map.get(lastName);  //читаем значение по ключу из мапы и присваиваем ArrayList
            s.add(tel);  //добавляем номер в ArrayList
            map.put(lastName, s);    //заносим в мапу
        } else {
            s = new ArrayList<>();   //создаем новый ArrayList
            s.add(tel);
            map.put(lastName, s);
        }
    }

    public void get(String lastName) {
        System.out.print(lastName + " ---> ");
        System.out.println(map.get(lastName));
    }


}
