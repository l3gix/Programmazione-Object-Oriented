package punto2;


import punto1.Classificabile;
import punto1.Classificazione;

public class Moneta implements Cloneable, Classificabile {

	public Moneta() {
		valore=0;	
	}
	
	public Moneta(double val, String e) {
		valore=val;	
		ente=e;
	}
	
	public double getValore(){
		return valore;
	}
	
	public String getEnte(){
		return ente;
	}
	
	public String toString(){
		return getClass().getName() + "[valore=" + valore + ", ente=" + ente + "]";
	}
	
	public boolean equals(Object o){
		if(o==null)
			return false;
		if(getClass() != o.getClass())
			return false;
		Moneta m = (Moneta) o;
		return valore==m.getValore() && ente.equals(m.getEnte());
	}
	
	public Moneta clone(){
		try {
			return (Moneta) super.clone();	
		}
		catch (CloneNotSupportedException e){
			return null;
		}
	}
	
	private double valore;
	private String ente;

    @Override
    public Classificazione getClassificazione() {
        return new Classificazione((int) valore,ente);
    }
}
