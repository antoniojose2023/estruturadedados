package estruturadedados.estruturadadosjava.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Tablet> queue = new LinkedList<>();

        queue.add(new Tablet("amazon"));
        queue.add(new Tablet("amazon8"));
        queue.add(new Tablet("amazon10"));

        System.out.println(queue);

        queue.peek();
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);


    }
}
