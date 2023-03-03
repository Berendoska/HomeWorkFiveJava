package org.example;
//Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(5365589, "Маринина");
        db.put(5365580, "Улиткина");
        db.put(5365581, "Навалов");
        db.put(5365582, "Глухов");
        db.put(5365521, "Глухов");
        db.put(5365588, "Маринина");
        db.put(6965581, "Навалов");

        for (var item : db.entrySet()) {

            if (item.getValue().equals("Навалов")) {
                System.out.println(item.getKey() + " " + item.getValue());
            }

        }

    }

}