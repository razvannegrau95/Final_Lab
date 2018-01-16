package Lab1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = Imagine.Builder_Imagine.class)

public class Imagine extends AbstractElement {
	
	private final String name;
	
	@JsonPOJOBuilder(buildMethodName = "build", withPrefix = "")
	
	public static class Builder_Imagine {
		

	private String name=null;
	
	
	public Builder_Imagine name(String val) {
        name = val;
        return this;
    }
	
	 public Imagine build() {
         return new Imagine(this);
     }
	}
	
	private Imagine(Builder_Imagine builder) {
        
        name = builder.name;
        
    }
	
	
	

	public String getName() {
		return name;
	}

	
	public void print() {
		System.out.println(name);
	}
	public void accept()
	{
		
	}
	
}