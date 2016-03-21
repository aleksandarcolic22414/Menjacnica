package paketInterfejsa;

import kurs.Kurs;

public interface MenjacnicaInterfejs {
	
	public void dodajKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs);
	public void obrisiKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs);
	public Kurs vratiKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs);
	
}
