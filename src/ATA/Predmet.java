package ATA;

import java.util.List;import java.util.ArrayList;


public class Predmet {
	String Ime;
	int Ects;



	public Predmet(String i, int e) {
		Ime = i;
		Ects = e;
	}
	
	int suma =0;
	public int SumaEcts(ArrayList<Predmet> predmeti)
	{
		int suma1 =0;
		predmeti.forEach((n) -> suma += n.Ects);
		suma1 += suma;
		suma = 0;
		return suma1;
	
	}
}
