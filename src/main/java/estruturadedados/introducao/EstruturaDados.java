package estruturadedados.introducao;

public class EstruturaDados {

    public static void main(String[] args) {

        No fila1 = new No("F1");
        No fila2 = new No("F2");
        No fila3 = new No("F3");
        No fila4 = new No("F4");

        fila1.setNo(fila2);
        fila2.setNo(fila3);
        fila3.setNo(fila4);

        System.out.println(fila1);
        System.out.println(fila1.getNo());
        System.out.println(fila1.getNo().getNo());
        System.out.println(fila1.getNo().getNo().getNo());

    }
}
