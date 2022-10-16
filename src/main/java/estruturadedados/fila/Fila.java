package estruturadedados.fila;

public class Fila {
    No refProximoNo;

    public Fila(){
         this.refProximoNo = null;
    }

    public void enqueue(No novoNo){
            novoNo.setRefProximoNo(this.refProximoNo);
            this.refProximoNo = novoNo;
    }

    public Boolean isEmpety(){
        return this.refProximoNo == null ? true : false;
    }

    public No dequeue(){
        if(!isEmpety()){
            No primeiroNo = this.refProximoNo;
            No auxiliar = this.refProximoNo;

            while(true){
                if(primeiroNo.getRefProximoNo() != null){
                      auxiliar = primeiroNo;
                      primeiroNo = primeiroNo.getRefProximoNo();
                }else{
                      auxiliar.setRefProximoNo(null);
                      break;
                }
            }

            return primeiroNo;

        }else{
            return null;
        }

    }


     public No first(){
          if(!isEmpety()){
              No primeiroNo = refProximoNo;

              while (true){
                  if(primeiroNo.getRefProximoNo() != null){
                        primeiroNo = primeiroNo.getRefProximoNo();
                  }else{
                      break;
                  }
              }
              return primeiroNo;
          }else{
                return null;
          }

     }


    @Override
    public String toString() {
        String response="";
        No auxiliar = this.refProximoNo;

        while (true){
            if(auxiliar != null){
                response += "[no "+auxiliar.getObject()+"]";
                auxiliar = auxiliar.getRefProximoNo();
            }else{
                break;
            }
        }

        return response;

    }
}
