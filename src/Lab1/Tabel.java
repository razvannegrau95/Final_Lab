package Lab1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import Lab1.Imagine.Builder_Imagine;

@JsonDeserialize(builder = Tabel.Builder_Tabel.class)



public class Tabel extends AbstractElement implements ComponentElement{
	
	private String name;
	
	@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")

	
	public static class Builder_Tabel {
		
		private String name=null;
		
		
		public Builder_Tabel name(String val) {
	        name = val;
	        return this;
	    }
		
		 public Tabel build() {
	         return new Tabel(this);
	     }
	}
		
		private Tabel(Builder_Tabel builder) {
	        
	        name = builder.name;
	        
	    }

	public Tabel(String string) {
			this.name=string;
		}

	public String getName() {
		return name;
	}

	
	public void print() {
		System.out.println(name);
	}
	
	public void accept(Visitor v)
	{
		v.visitTabel(this);
	}
	
	
}