package estruturadedados.estruturadadosjava.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tablet> list = new ArrayList<>();

        list.add(new Tablet("amazon1"));
        list.add(new Tablet("amazon2"));
        list.add(new Tablet("amazon3"));
        list.add(new Tablet("amazon4"));

        System.out.println(list);

        //list.remove(0);
        System.out.println(list.size());


        System.out.println(list.subList(0,2));

    }
}
