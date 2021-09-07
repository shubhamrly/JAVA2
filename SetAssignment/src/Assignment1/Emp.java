package Assignment1;

import java.util.*;

public class Emp {
  HashSet <String> hs = new HashSet<String>();
  public Void setEmp(String name)
  {
	  hs.add(name);
	return null;
  }
  public void getEmp()
  { 
	 
	  Iterator<String> it = hs.iterator();
	  
	  
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
  }
  
  public static void main(String  []  args)
  {
	  Emp e = new Emp();
	  e.setEmp("Shubham");
	  e.setEmp("Verma");
	  e.setEmp("Name");
	  e.getEmp();
  }
  
}
