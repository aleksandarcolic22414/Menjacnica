package kurs;

import java.util.GregorianCalendar;

public class Kurs {

	private GregorianCalendar datumKursa;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}
	public void setDatumKursa(GregorianCalendar datumKursa) {
		this.datumKursa = datumKursa;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}

}
