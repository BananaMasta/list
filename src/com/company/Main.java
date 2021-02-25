package com.company;

import java.io.IOException;
import java.util.*;

public class Main {
    int i = 0;

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        map.put(24523321, "Рябихин Владимир Сергеевич");
        map.put(4562355, "Кукуев Андрей Анатольевич");
        map.put(5792335, "Шевченко Анатолий Вазгенович");
        map.put(3567783, "Пепега Анатолий Павлович");
        map.put(2954535, "Жмышенко Валерий Альбертович");

        System.out.println("Введите имя");
        String s = scanner.nextLine();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().toString().contains(s)) {
                list.add(entry.getValue().toString());
//                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
        ArrayList<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>(massiv.length);
        System.out.println(list);
    }
}

//        while (true) {
//            String s = scanner.nextLine();
//            if (s.isEmpty()) {
//                break;
//            }
//            number++;
//            map.put(number, s);
//
//        }
//        for (Map.Entry entry : map.entrySet()) {
//            if (scanner.nextLine().equals(entry.getValue())) {
//                System.out.println(entry.getKey() + "-" + entry.getValue());
//                break;
//            }
//        }
//        map.remove(3567783);
//        for (Map.Entry entry: map.entrySet()){
//            System.out.println(entry);
//
//        }

