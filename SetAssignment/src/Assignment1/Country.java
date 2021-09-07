package Assignment1;

import java.util.*;

public class Country {
HashSet <String> s = new HashSet<String>();

String saveCountryNames(String CountryName)
{
	s.add(CountryName);
	 
  return s.toString();
}
@SuppressWarnings("rawtypes")
String getCountry(String CountryName)
{ String st="NULL";

Iterator it = s.iterator();
	while(it.hasNext())
	{
		String d= (String) it.next();
		if(d.equals(CountryName)) {
			
			st=CountryName;
		}
	}
	return st;
}
public static void main(String [] args) {
	Country cs = new Country();
	System.out.println(cs.saveCountryNames("India"));
	System.out.println(cs.saveCountryNames("Indiana"));
	System.out.println(cs.getCountry("India"));
}
}

