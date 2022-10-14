package estruturadedados.pilha;

public class Main {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.push(new No("1"));
        pilha.push(new No("2"));
        pilha.push(new No("3"));
        pilha.push(new No("4"));

        System.out.println(pilha);

        //No no = pilha.top();
        No no = pilha.pop();
        System.out.println(pilha);
        System.out.println(no);

    }
}
