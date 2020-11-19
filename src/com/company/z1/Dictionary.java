package com.company.z1;

import java.util.*;

public class Dictionary {
    Map<String, String> dict = new HashMap<String, String>();
    Scanner scan = new Scanner(System.in);
    void add() {
        for (int i = 0; i < 5; i++) {
            dict.put(scan.next(), scan.next());
        }
    }
    void rewrite() {
    List<String> keys = new ArrayList<>(dict.keySet());
    List<String> values = new ArrayList<>(dict.values());
        for (int i = 0; i < values.size(); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j))) {
                    dict.remove(keys.get(j));
                }
            }
        }
    }
    void out() {
            System.out.println(dict.toString());
    }
}
