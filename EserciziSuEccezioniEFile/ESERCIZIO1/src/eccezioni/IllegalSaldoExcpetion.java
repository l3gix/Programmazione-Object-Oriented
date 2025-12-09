package eccezioni;

//Eccezione controllata
public class IllegalSaldoExcpetion extends Exception{
    public IllegalSaldoExcpetion(){
        super("Instaziazione Saldo negativo");
    }
    public IllegalSaldoExcpetion(String message){
        super(message);
    }
}
