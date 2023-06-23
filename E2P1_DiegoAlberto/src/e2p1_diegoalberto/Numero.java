package e2p1_diegoalberto;


public class Numero {
     private int base;
     private String numero;
     
     public Numero(){
     }
     
     public Numero(int base2,String num){
         this.base = base2;
         this.numero = num;
     
     }

    public void setBase(int base) {
        this.base = base;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getBase() {
        return base;
    }

    public String getNumero() {
        return numero;
    }
    
    public char numToChar( int numero){
        if (numero >= 0 || numero<10) {
            numero+=48;
        }else{
            numero += 87;
        }
        char num = (char)numero;
    
    return num;
    }
    
}
