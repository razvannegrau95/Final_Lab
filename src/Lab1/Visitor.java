package Lab1;

public interface Visitor {
	
	public void accept();
	public void visit();
	public void visitSectiune();
	public void visitImageProxy(ImageProxy ip);
	public void visitImagine(Imagine i);
	public void visitParagraf(Paragraf p);
	public void visitTabel(Tabel t);
	public void print();



}
