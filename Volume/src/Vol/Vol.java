package Vol;

import java.util.*;

public class Vol {
double l , b , h , vol ;
public Vol() { l = 0; b = 0 ; h = 0; vol = l*b*h;}
public Vol (double l  , double b , double h ) {
	this.l = l ; this.b = b;
	this.h = h;
	this.vol = l * b * h ;
}
public static void main(String  [] args)
{Scanner s = new Scanner (System.in);
	HashSet<Vol> hs =new HashSet<Vol>();
	
	System.out.println("Enter Number of box");
	int c = s.nextInt();int i = 0;
	Vol v [] = new Vol [c];
	for(int t = 0 ; t<c ; t++)
	{
		v[t] = new Vol();
	}
	while(i<c)
	{
		System.out.println("Enter Length");
		double l = s.nextDouble();
		System.out.println("Enter Breadth");
		double b = s.nextDouble();
		System.out.println("Enter Height");
		double h = s.nextDouble();
	    double vol  = l*b*h;
	    boolean p = false;
	    for(int  t = 0 ; t< i;t++ )
	    {
	    	if(vol == v[t].vol)
	    	{
	    		 p = true;
	    	}
	    }
	    if(p == false) {
	    	v [i] = new Vol(l,b,h); 
	    	hs.add(v[i]);
	    }
	    i++;
	}
	for(Vol ve : v)
	{
		if(ve.vol != 0 )
		{

			System.out.println(" Lenght " + ve.l+" Breadth " + ve.b+"  heigth "  + ve.h + "  Volume " + ve.vol);

		}
	}
	s.close();
}
}
