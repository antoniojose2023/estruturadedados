package estruturadedados.fila;

public class No {

    private Object object;
    private No refProximoNo;

    public No(){}

    public No(Object object){
          this.refProximoNo = null;
          this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
