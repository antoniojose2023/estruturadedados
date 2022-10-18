package estruturadedados.estruturadadosjava.set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

            Set<Tablet> set = new HashSet<>();
            set.add(new Tablet("amazon1"));
            set.add(new Tablet("amazon3"));
            set.add(new Tablet("amazon4"));
            set.add(new Tablet("amazon2"));

            System.out.println(set);

            System.out.println(set);

    }
}
