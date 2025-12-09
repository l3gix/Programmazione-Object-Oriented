package punto3;

import allegati.Moneta;

import java.util.ArrayList;

public class Borsa {


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
	
	public void remove(Moneta m) throws MonetaNonPresenteException {
		
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
	
	public void ordinaBorsa() {
        for (int i = 0; i < money.size() - 1; i++) {
            for (int j = 0; j < money.size() - i - 1; j++) {
                if (money.get(j).getValore() > money.get(j + 1).getValore()) {
                    Moneta temp = money.get(j);
                    money.set(j, money.get(j + 1));
                    money.set(j + 1, temp);
                } else if (money.get(j).getValore() == money.get(j + 1).getValore()) {
                    if (money.get(j).getEnte()
                            .compareTo(money.get(j + 1).getEnte()) > 0) {
                        Moneta temp = money.get(j);
                        money.set(j, money.get(j + 1));
                        money.set(j + 1, temp);
                    }
                }
            }
        }
    }
	private ArrayList<Moneta> money;
	private int taglia;


}