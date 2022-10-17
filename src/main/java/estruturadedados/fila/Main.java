package estruturadedados.fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue("1");
        fila.enqueue("2");
        fila.enqueue("3");
        fila.enqueue("4");
        fila.enqueue("5");

//        //Imprimindo fila completa
//        System.out.println(fila);
//
//        //Imprimindo primeiro da fila
//        System.out.println(fila.first());

        //Imprimir e remover primeiro da fila
        Object no = fila.dequeue();
        System.out.println(fila);
        System.out.println(no);

    }
}
