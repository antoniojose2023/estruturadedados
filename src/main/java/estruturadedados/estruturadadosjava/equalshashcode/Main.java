package estruturadedados.estruturadadosjava.equalshashcode;

public class Main {
    public static void main(String[] args) {

        Tablet tablet = new Tablet("amazon");
        Tablet tablet1 = new Tablet("amazon1");

        tablet = tablet1;

        System.out.println(tablet.equals(tablet1));
        System.out.println(tablet.hashCode());
        System.out.println(tablet1.hashCode());


    }
}
