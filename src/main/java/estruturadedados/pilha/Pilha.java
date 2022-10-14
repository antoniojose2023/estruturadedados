package estruturadedados.pilha;

public class Pilha {

    private No refNo;

    public Pilha(){
        refNo = null;
    }

   public No pop(){
        if(!isEmpty()){
            No auxiliar = this.refNo;
            this.refNo = this.refNo.getNo();
            return auxiliar;
        }
        return null;
   }

    public void push(No novoNo){
         No auxiliar = this.refNo;
         this.refNo = novoNo;
         this.refNo.setNo( auxiliar );
    }

    public No top(){
        return this.refNo;
    }

    public Boolean isEmpty(){
        if(this.refNo != null){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String response;

        No auxiliar = this.refNo;

        response = "------------------------";

        while (true){
            if(auxiliar != null){
                response += "No ["+auxiliar.getContent()+"]";
                auxiliar = auxiliar.getNo();
            }else{
                break;
            }
        }

        return response;
    }
}
