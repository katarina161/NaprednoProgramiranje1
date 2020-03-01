package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	
	public String naslov;
	public String isbn;
	public LinkedList<Autor> autori;
	public String izdavac;
	public String izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	public void setAutori(LinkedList<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public String getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
