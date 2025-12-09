package eccezioni;

public class IllegalIndexExcpetion extends IndexOutOfBoundsException{
    public IllegalIndexExcpetion(String message){
        super(message);
    }

    public IllegalIndexExcpetion(){
        super("Fuori dal range dei valori");
    }
}
