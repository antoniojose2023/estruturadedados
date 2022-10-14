package estruturadedados.pilha;

public class No {
    private No no;
    private String content;

    public No(String content){
          this.no = null;
          this.content = content;
    }

    public No getNo() {
        return no;
    }

    public void setNo(No no) {
        this.no = no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Pilha{" + "content='" + content + '\'' +'}';
    }
}
