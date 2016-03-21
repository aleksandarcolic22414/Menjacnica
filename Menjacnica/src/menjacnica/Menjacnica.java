package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import kurs.Kurs;
import paketInterfejsa.MenjacnicaInterfejs;
import valute.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> listaValuta;
	@Override
	public void dodajKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs) {
		Valuta v = new Valuta();
		v.setKurs(kurs);
		v.setNazivValute(nazivValute);
		v.setSkraceniNazivValute(skraceniNazivValute);
		if(!listaValuta.contains(v))
			listaValuta.add(v);
	}

	@Override
	public void obrisiKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs) {

		Valuta val = new Valuta();
		val.setKurs(kurs);
		val.setNazivValute(nazivValute);
		val.setSkraceniNazivValute(skraceniNazivValute);
		if(listaValuta.contains(val))
			listaValuta.remove(val);

	}

	@Override
	public Kurs vratiKursValuteZaOdredjeniDan(String nazivValute,String skraceniNazivValute,Kurs kurs) {

		Valuta val = new Valuta();
		val.setKurs(kurs);
		val.setNazivValute(nazivValute);
		val.setSkraceniNazivValute(skraceniNazivValute);
		if(listaValuta.contains(val))
			return kurs;
		return null;

	}

}
