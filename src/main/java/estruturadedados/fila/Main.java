package estruturadedados.fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(new No("1"));
        fila.enqueue(new No("2"));
        fila.enqueue(new No("3"));
        fila.enqueue(new No("4"));
        fila.enqueue(new No("5"));

//        //Imprimindo fila completa
//        System.out.println(fila);
//
//        //Imprimindo primeiro da fila
//        System.out.println(fila.first());

        //Imprimir e remover primeiro da fila
        No no = fila.dequeue();
        System.out.println(fila);
        System.out.println(no);

    }
}
