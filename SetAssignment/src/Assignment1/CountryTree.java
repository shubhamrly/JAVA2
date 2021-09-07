package Assignment1;

import java.util.*;
import java.util.Iterator;

public class CountryTree {
	TreeSet <String> s = new TreeSet<String>();

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
		CountryTree cs = new CountryTree();
		System.out.println(cs.saveCountryNames("India"));
		System.out.println(cs.saveCountryNames("Indiyne"));
		System.out.println(cs.saveCountryNames("Andiynety"));
		
		System.out.println(cs.getCountry("India"));

		System.out.println(cs.getCountry("Indiatrq"));
		
	}
	}



