package q2;

import java.io.Serializable;

public class Autore implements Serializable
{
	public Autore(String n, Indirizzo ind) {
		nome = n;
		indirizzo = ind;
	}

	public String getNome() {
		return nome;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	private String nome;
	private Indirizzo indirizzo;
}
