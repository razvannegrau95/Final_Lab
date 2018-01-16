package Lab1;

public class DocumentStatisticsVisitor implements Visitor{
	private String name;
	private int contor=0;
	

	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitSectiune() {
		// TODO Auto-generated method stub
		contor++;
		
	}

	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public void printStatistics()
	{
		System.out.println(name);
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
	public void visitTabel(Tabel t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitParagraf(Paragraf p) {
		// TODO Auto-generated method stub
		
	}

}
