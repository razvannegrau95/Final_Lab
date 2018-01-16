package Lab1;

import java.util.ArrayList;

public class Sectiune implements Element{
	
	String titlu;
	private String text;
	private int contor;

	
	


	public static class Builder_Sectiune {
		private String titlu=null;
		private String text=null;
		private int contor;
		
		public Builder_Sectiune contor(int val) {
              contor=val;
              return this;
        }
		
		public Builder_Sectiune titlu(String val) {
            titlu = val;
            return this;
        }
		
		public Builder_Sectiune text(String val) {
            text = val;
            return this;
        }
		public Sectiune build() {
            return new Sectiune(this);
        }
	}
    
    private Sectiune(Builder_Sectiune builder) {
        contor = builder.contor;
        titlu = builder.titlu;
        text = builder.text;
        
    }
	
	
	public String getText() {
		return text;
	}
	
	public Sectiune(final String text) {
		this.text = text;
	}

	public void print() {
		System.out.println(text);
	}
	ArrayList<Element> elems = new ArrayList<Element>();
	
	@Override
	public void add(Element e) {
		elems.add(e);
	}
	
	@Override
	public void remove(Element e) {
		elems.remove(e);
	}

	@Override
	public Element getElement(int i) {
		return elems.get(i);
	}

	@Override
	public Element getElement() {
		return elems.get(0);
	}

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(Visitor v) {
		v.visitSectiune();
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSectiune() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImageProxy(ImageProxy ip) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImagine(Imagine i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraf(Paragraf p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTabel(Tabel t) {
		// TODO Auto-generated method stub
		
	}

	
	
	

	//@Override
	//public void print() {
	//	System.out.println(elems);
	//}
}