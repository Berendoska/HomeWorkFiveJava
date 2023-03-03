package org.example;
//Написать программу, которая найдет и выведет
// повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        String[] empl = new String[]{"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        printWords(empl);

    }

    static public void printWords(String[] arr) {
        ArrayList<String> employeeName = new ArrayList<>();
        for (String item : arr) {
            employeeName.add(item.split(" ")[0]); // Выделяем только Имена в отдельный массив
        }
        System.out.println("Только имена " + employeeName);


        Map<String, Integer> name = new HashMap<>();
        for (int i = 0; i < employeeName.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < employeeName.size(); j++) {
                if (employeeName.get(i).equals(employeeName.get(j))) {
                    count++;
                }
            }
            if (name.containsKey(employeeName.get(i)) == false) {
                name.put(employeeName.get(i), count);
            }
        }

        ArrayList<Integer> listCount = new ArrayList<>();
        for (var item : name.entrySet()) {
            if (listCount.contains(item.getValue()) == false) listCount.add(item.getValue());
        }
        System.out.println("Повторяющиеся имена: ");
        listCount.sort(null);
        for (int i = listCount.size() - 1; i >= 0; i--) {
            for (var item : name.entrySet()) {
                if (listCount.get(i) == item.getValue()) {
                    System.out.println(item.getKey() + " - " + item.getValue());
                }
            }
        }
    }

}






