package Assignment1;

import java.util.*;

public class Trees {
	TreeSet <String> ts = new  TreeSet <String>();
	public void addnew(String s )
	{
		ts.add(s);
		
	}
	public void reverseSet()
	{
		ts.descendingSet();
		System.out.println(ts.descendingSet());
		
	}
	public void iter()
	{
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public void iterCheck(String s)
	{
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{   
			String d = it.next();
		if(d.equals(s)) {	
		System.out.println("Here:"+d);
		}}
	}
	public static void main(String  []  args)
	  {Trees ts = new Trees ();
		
	  ts.addnew("New"); ts.addnew("Object");ts.addnew("is ");ts.addnew("This");
		
	  ts.reverseSet();
		ts.iter();
		ts.iterCheck("This");
		
	  }
}
