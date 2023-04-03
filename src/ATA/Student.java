package ATA;

import java.util.ArrayList;
import java.util.List;
public class Student extends Osoba {
String jmbag;
List<Predmet> lpredmeti;



public Student(String i, String p, String o, String adr, String dat, String jmg, List<Predmet> l) {
ime = i;
prezime = p;
oib = o;
adresa = adr;
datumRod = dat;
jmbag = jmg;
lpredmeti =l;
}

public static void main(String[] args) {
	Predmet p1 = new Predmet("ATA",3);
	Predmet p2 = new Predmet("PMA",6);
	Predmet p3 = new Predmet("MAT",9);
	Predmet p4 = new Predmet("OOP",3);
	Predmet p5 = new Predmet("ZAVRSNI",12);
	List <Predmet> prvipredmeti = new ArrayList<Predmet>();
	List <Predmet> drugipredmeti = new ArrayList<Predmet>();
	List <Student> studenti = new ArrayList<Student>();
	prvipredmeti.add(p5);
	prvipredmeti.add(p4);
	prvipredmeti.add(p3);
	drugipredmeti.add(p1);
	drugipredmeti.add(p2);
	drugipredmeti.add(p3);
	Student o2 = new Student("Ivan", "Horvat", "98765432100","Virovitica 1","1.10.2000","123",prvipredmeti);
	Student o3 = new Student("Ivan1", "Horvat1", "98765432100","Virovitica 1","1.10.2000","1233",drugipredmeti);
	studenti.add(o2);
	studenti.add(o3);
	 studenti.forEach((n) ->  System.out.println("Student Name is " + n.ime));
	 studenti.forEach((n) -> System.out.println(p1.SumaEcts((ArrayList<Predmet>) n.lpredmeti)));
}
}