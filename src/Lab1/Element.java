package Lab1;

public interface Element extends Visitor{
	
	public void add(Element e);
	public void remove(Element e);
	public Element getElement(int i);
	public Element getElement();
	public void print();
	public void accept(Visitor v);

}