package Lab1;

import java.util.ArrayList;

public class AbstractElement implements Element {
	
	private ArrayList<Element> elems;

	@Override
	public void add(Element e) {
		this.elems.add(e);
	}

	@Override
	public void remove(Element e) {
		this.elems.remove(e);
	}

	@Override
	public Element getElement(int i) {
		return this.elems.get(i);
	}

	@Override
	public Element getElement() {
		return this.elems.get(0);
	}

	@Override
	public void print() {
		for(Element e:elems) {
			e.print();
		}
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
}