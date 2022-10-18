package estruturadedados.estruturadadosjava.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "antonio");
        map.put("2", "maria");
        map.put("3", "jose");
        map.put("4", "joao");

//        System.out.println(map);
//
//        map.remove("1");
//        System.out.println(map);

        List<Map<String, String>> list = new ArrayList<>();

        list.add(map);

        System.out.println(list);


    }
}
