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
    
    

    public int charToNum(char caracter) {
        int numero;
        if (caracter >= '0' && caracter <= '9') {
            numero = caracter - '0';
        } else {
            numero = caracter - 'a' + 10;
        }
        return numero;
    }

    public String decToBase(int decimal) {
        StringBuilder resultado = new StringBuilder();
        int cociente = decimal;
        while (cociente > 0) {
            int residuo = cociente % base;
            char caracter = numToChar(residuo);
            resultado.insert(0, caracter);
            cociente = cociente / base;
        }
        return resultado.toString();
    }

    public int baseToDec(String base) {
        int decimal = 0;
        int longitud = base.length();
        int exponente = 0;
        for (int i = longitud - 1; i >= 0; i--) {
            char caracter = base.charAt(i);
            int valor = charToNum(caracter);
            decimal += valor * Math.pow(this.base, exponente);
            exponente++;
        }
        return decimal;
    }
    
}
