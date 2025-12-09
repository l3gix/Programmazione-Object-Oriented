package punto1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class Container <T extends Prodotto>
{

	
	private ArrayList<T> lista;
	private int capacitaMax;
	private int capacitaCaricata;
	
	public Container(int capacitaMax) {
		lista = new ArrayList<T>();
		this.capacitaMax = capacitaMax;
		capacitaCaricata = 0;
	}
	
	public ArrayList<T> select(Predicate<T> c){
		ArrayList<T> tmp = new ArrayList<T>();
		for(T p : lista) {
			if(c.test(p))
				tmp.add(p);
		}
		return tmp;
	}
	
	public void add(T prodotto) throws FullContainerException
    {
		int index  = trova(prodotto);
        if(capacitaCaricata + (prodotto.getPeso()) > capacitaMax ) throw new FullContainerException();
		if(index < 0 && (capacitaCaricata + (prodotto.getPeso()) <= capacitaMax )) {
			lista.add(prodotto);
			capacitaCaricata += prodotto.getPeso();
		}
	}
	
	public T delete(T prodotto) throws ItemNotFoundException
    {
        T p;
		int index = trova(prodotto);
		if(index >= 0) {
			p=lista.remove(index);
			capacitaCaricata -= p.getPeso();
			return p;
		}
		else throw new ItemNotFoundException();
	}
	
	
	private int trova(T p) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).equals(p))
				return i;
		return -1;
	}
	
	public int getSize() {
		return lista.size();
	}
	
	public int getCapacitaMax() {
		return capacitaMax;
	}
	
	public int getCapacitaCaricata() {
		return capacitaCaricata;
	}
	
	
}
