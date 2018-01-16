package Lab1;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


//@JsonDeserialize(builder = Carte.Builder.class)



public class Carte {
	
	String titlu;
	ArrayList<Autor> autori = new ArrayList<Autor>();
	ArrayList<Element> continut = new ArrayList<Element>();
	
	
	//(buildMethodName = "build", withPrefix = "")
	
	
	
	public Carte() {
		
	}
	
	public Carte(String titlu) {
		this.titlu = titlu;
	}
	
	public Carte(String titlu, ArrayList<Autor> a) {
		
		this.titlu = titlu;
		this.autori = a;
	}
	
	public void addAutor(Autor a) {
		this.autori.add(a);
	}
	
	public void addElement(Element elem) {
		continut.add(elem);
	}
	
	public void printElements() {
		for(Element elem: this.continut) {
			elem.print();
		}
	}
	
	public void printAutori() {
		for(Autor autor: this.autori) {
			autor.print();
		}
	}
	
	public void print() {
		System.out.println(this.titlu);
		this.printAutori();
		this.printElements();
	}
	
	public static void main(String args[]) {
				
		/*Carte c  = new Carte("carte1");
		c.addAutor(new Autor("autor1"));
		c.addAutor(new Autor("autor2"));
		//c.addElement(new Imagine.Builder_Imagine().name("Imaginea 1"));
		
		
		//c.addElement(new Tabel("tabel1"));
		
		c.addElement(new Imagine.Builder_Imagine().name("Imaginea 1").build());
		
		
		c.addElement(new Tabel.Builder_Tabel().name("tabel1").build());

		c.print();	
		Sectiune cap1=new Sectiune("Capitol 1");
		Paragraf p1=new Paragraf("Paragraf1");
		LeftAllign la=new LeftAllign();
		p1.setAllign(la);
		c.addElement(p1);
		
		
		Element book=new Sectiune("MYBOOK");
		DocumentStatisticsVisitor v=new DocumentStatisticsVisitor();
		
		
		c.print();	
		Sectiune cap2=new Sectiune("Capitol 2");
		Paragraf p2=new Paragraf("Paragraf2");
		LeftAllign la2=new LeftAllign();
		p1.setAllign(la2);
		c.addElement(p2);
		
		book.accept(v);
		v.printStatistics();
		*/
		
		Tabel t1=new Tabel("TABEL 1 ");
		Tabel t2=new Tabel("TABEL 2 ");
		Tabel t3=new Tabel("TABEL 3 ");
		Tabel t4=new Tabel("TABEL 4 ");
		
		Tabel t5=new Tabel("TABEL 5 ");
		Tabel t6=new Tabel("TABEL 6 ");
		Tabel t7=new Tabel("TABEL 7 ");
		Tabel t8=new Tabel("TABEL 8 ");
		
		SpecialElement se=new SpecialElement("qwerty");
		SpecialElement se1=new SpecialElement("masina");
		SpecialElement se2=new SpecialElement("lapte");
		
		se1.add(t1);
		se1.add(t2);
		se1.add(t3);
		
		se2.add(t4);
		se.add(t5);
		se.add(t6);
		se.add(t7);
		se.add(t8);
		se.add(se1);
		se.add(se2);
		
		
		se.print();
		
		
		
		
		
		
		
	}
}