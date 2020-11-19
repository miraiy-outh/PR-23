package com.company.z2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> bts = new ArrayList<>();
        bts.add(new City("Россия", "Москва"));
        bts.add(new City("Россия", "СПБ"));
        bts.add(new City("США", "Нью-Йорк"));
        bts.add(new City("Россия", "Йошкар-Ола"));
        bts.add(new City("Россия", "Чебоксары"));
        bts.add(new City("США", "Сан-Франциско"));
        bts.add(new City("Испания", "Мадрид"));
        bts.add(new City("Австралия", "Канберра"));
        bts.add(new City("Япония", "Токио"));
        bts.add(new City("Япония", "Киото"));
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < bts.size(); i++) {
            map.put(bts.get(i).getCountry(), new ArrayList<>());
        }
        for (int i = 0; i < bts.size(); i++) {
            map.get(bts.get(i).getCountry()).add(bts.get(i).getTown());
        }
        System.out.println(map.toString());
    }
}
