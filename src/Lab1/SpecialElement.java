package Lab1;

import java.util.ArrayList;
import java.util.List;

public class SpecialElement implements ComponentElement {
	
	
	private String text;
	
	public SpecialElement(String text) {
		this.text = text;
	}
	private List<ComponentElement> child = new ArrayList<ComponentElement>();
	public void print()
	{
		System.out.println("Special Element :"+this.text);
		System.out.println("The KIDS of"+this.text+" :");
		for(ComponentElement ce:child)
		{
			ce.print();
		}
	}
	
	public void add(ComponentElement ce)
	{
		child.add(ce);
		
	}
	public void remove(ComponentElement ce)
	{
		child.remove(ce);
	}

	
	
	

}
