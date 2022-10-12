package introducao;

public class No {

    private No no;
    private String content;

    public No(String content){
           this.content = content;
           no = null;
    }

    public No getNo() {
        return no;
    }

    public void setNo(No no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Fila{" + "content='" + content + '\'' +'}';
    }
}
