package ATA;

public class Osoba {
String ime;
String prezime;
String oib;
String adresa;
String datumRod;
public Osoba() {
ime = "";
prezime = "";
oib = "";
}
 // drugi konstruktor
public Osoba(String i, String p, String o, String adr, String dat) {
ime = i;
prezime = p;
oib = o;
adresa = adr;
datumRod = dat;
}
public void Ispis() {
System.out.println("Ime: " +ime);
System.out.println("Prezime: " + prezime);
System.out.println("OIB: " + oib);
}



public static void main(String[] args) {
 // kreiramo objekt o1 klase Osoba:
Osoba o1 = new Osoba();
// ispis imena, prezimena i OIB-a objekta o1, to su prazni stringovi
 //zbog poziva konstruktora bez argumenata:
System.out.println("Ime: " + o1.ime);
System.out.println("Prezime: " + o1.prezime);
System.out.println("OIB: " + o1.oib);
System.out.println("-----------------");
//o1.ime = "Marko"; // definiramo ime objekta o1
o1.prezime = "Maric"; // definiramo prezime objekta o1
o1.oib = "01234567891"; // definiramo OIB objekta o1
System.out.println("Ime: " + o1.ime);
System.out.println("Prezime: " + o1.prezime);
System.out.println("OIB: " + o1.oib);
System.out.println("-----------------");
 // kreiramo objekt o2 klase Osoba pozivom drugog konstruktora:
Osoba o2 = new Osoba("Ivan", "Horvat", "98765432100","Virovitica 1","1.10.2000");
System.out.println("Ime: " + o2.ime);
System.out.println("Prezime: " + o2.prezime);
System.out.println("OIB: " + o2.oib);
System.out.println("Adresa: " + o2.adresa);
System.out.println("OIB: " + o2.datumRod);
o2.Ispis();
o2.AzurirajAdresu("A");
if(o1.ProvjeraString(o1.ime)== false){
	System.out.println("ponoviti");
};
System.out.println("Adresa: " + o2.adresa);
o2.ProvjeraOIB();
o2.ProvjeraDatuma();
}


public void AzurirajAdresu(String a) {
	if(a != null && !a.isEmpty())
		adresa = a;
	else System.out.println("Pogresan unos!");;
}


public void ProvjeraOIB() {
	try {
	long l = Long.parseLong(oib);
	if(l < 0) {
	System.out.println("OIB ne smije biti negativan broj!");
	return;
	}
	}
	catch(NumberFormatException nfe){
	System.out.println("OIB mora sadržavati samo znamenke!");
	return;
	}
	if( oib.length()!=11) {
	System.out.println("OIB mora sadržavati 11 znamenaka!");
	return;
	}
	else {
	System.out.println("OIB je ispravnog formata.");
	}
}
public void ProvjeraDatuma() {
	try {
		String prvibroj=(datumRod.substring(0,2));
		String drugibroj=(datumRod.substring(2,5));
		String godina=(datumRod.substring(5,datumRod.length()));
		String prvibroj1 = prvibroj.replaceAll("[^0-9]", "");
		String drugibroj2 = drugibroj.replaceAll("[^0-9]", "");
		String godina3 = godina.replaceAll("[^0-9]", "");
		// System.out.println(prvibroj1);
		// System.out.println(drugibroj2);
		// System.out.println(godina3);
		//int x =Integer.parseInt(prvibroj1);
		//int y =Integer.parseInt(drugibroj2);
		if(Integer.parseInt(prvibroj1)  > 0 && Integer.parseInt(prvibroj1) <= 31 && Integer.parseInt(drugibroj2) > 0 &&Integer.parseInt(drugibroj2) < 13&& Integer.parseInt(prvibroj1) <= 31 && Integer.parseInt(godina) > 1990 &&Integer.parseInt(godina) < 2023 )
		{
		 System.out.println("Ispravan");
			return;}
		else 	{
			 System.out.println("Neispravan");
				return;}
	}
	catch(NumberFormatException nfe) {
		 System.out.println("greska");
			return;
	}
	}
private boolean ProvjeraString(String string) {
	if(string.length() == 0 || string.isEmpty()) {
		 return false;
	}
	else{
		return true;
	}
}
}


