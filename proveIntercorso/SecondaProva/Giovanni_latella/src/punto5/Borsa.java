package punto5;


import punto3.BorsaPienaException;
import punto3.MonetaNonPresenteException;

import java.io.Serializable;
import java.util.ArrayList;

public class Borsa implements Serializable {


	public Borsa(int x){
		money = new ArrayList<Moneta>();
		taglia = x;
	}
	
	
	public void addMoneta(Moneta a) throws BorsaPienaException {
		if (money.size()<taglia) 
			money.add(a);
        else
        {
            throw new BorsaPienaException();

        }
	}
	
	public void remove(Moneta m) throws BorsaPienaException {
		
		for(int i=0; i < money.size(); i++){
			 
			if(m.equals(money.get(i))) {	
				money.remove(i);
				return;
			}

		}

        throw new MonetaNonPresenteException();
		
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