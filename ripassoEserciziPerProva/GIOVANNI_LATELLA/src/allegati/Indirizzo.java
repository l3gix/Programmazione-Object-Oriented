package allegati;

public class Indirizzo {

	public Indirizzo(String v, String c, String ca, String ci) {
		setVia(v);
		setCivico(c);
		setCap(ca);
		setCitta(ci);
	}

	public String getVia() {
		return via;
	}

	public void setVia(String v) {
		via = v;
	}

	public String getCivico() {
		return civico;
	}

	public void setCivico(String c) {
		civico = c;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String c) {
		cap = c;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String c) {
		citta = c;
	}

	private String via, civico, cap, citta; 
}
