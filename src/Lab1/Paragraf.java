package Lab1;

import Lab1.Tabel.Builder_Tabel;

public class Paragraf extends AbstractElement {
	
	private String text;
	private AllingStrategy stallign=null;
	private int contor=0;
	
	
	
	public static class Builder_Paragraf {
		
		private String text=null;
		private  int contor;
		
		public Builder_Paragraf contor(int val)
		{
			contor=val;
			return this;
		}
		
		
		public Builder_Paragraf text(String val) {
	        text = val;
	        return this;
	    }
		
		 public Paragraf build() {
	         return new Paragraf(this);
	     }
	}
		
		private Paragraf(Builder_Paragraf builder) {
	        
	        text = builder.text;
	        contor=builder.contor;
	        
	    }

	public String getText() {
		return text;
	}

	
	
	public Paragraf(final String text) {
		this.text = text;
	}

	public void print() {
		if(stallign==null)
			System.out.println(text);
		else
			stallign.print(text);
	}

	

	public void setAllign(AllingStrategy stallign) {
		this.stallign = stallign;
	}
	
	public void accept(Visitor v)
	{
		v.visitParagraf(this);
	}
	
	public void visitParagraf(Paragraf p)
	{
		contor++;
	}

}