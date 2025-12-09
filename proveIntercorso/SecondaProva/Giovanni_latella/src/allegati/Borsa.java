package allegati;

import java.util.ArrayList;

public class Borsa {


	public Borsa(int x){
		money = new ArrayList<Moneta>();
		taglia = x;
	}
	
	
	public void addMoneta(Moneta a){
		if (money.size()<taglia) 
			money.add(a);
	}
	
	public void remove(Moneta m){
		
		for(int i=0; i < money.size(); i++){
			 
			if(m.equals(money.get(i))) {	
				money.remove(i);
				return;
			}
		}
		
	}
	
	public Moneta get(int i) {
		return money.get(i);
	}
	
	public int getSize() {
		return money.size();
	}
	
	
	private ArrayList<Moneta> money;
	private int taglia; 
}