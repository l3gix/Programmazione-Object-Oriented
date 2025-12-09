package eccezioni;

//Eccezione non controllata
public class IllegalSommaExcpetion extends IllegalArgumentException{
    public IllegalSommaExcpetion(String message){
        super(message);
    }

    public IllegalSommaExcpetion(){
        super("Somma non consentita");
    }
}
