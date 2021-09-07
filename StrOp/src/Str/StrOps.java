package Str;

import java.util.*;
import java.util.Scanner;

public class StrOps {
public static  void main(String  [] args)
{
	ArrayList <String> arr = new ArrayList<String>();
	try (Scanner s = new Scanner(System.in)) {
		do
		{   System.out.println("1.Insert");
		System.out.println("2.Serch");
		System.out.println("3.Delete");
		System.out.println("4.Display");
		System.out.println("5.Exit");
			System.out.println("Enter your choice ");
			switch(s.nextInt())
			{
			case 1 : System.out.println("Enter the item to be inserted");
			         arr.add(s.next());
			         break;
			case 2: System.out.println("Enter the item to search");
			         String k = s.next();
			        boolean f=arr.contains(k);
			        if(f == true)
			        {
				       System.out.println("Item found in the list");
			          }
			       else      {
				System.out.println("Item not found in the list");
			       }
			        break;
			case 3:
				System.out.println("Enter the item to delete");
				s.nextLine();
				String se = s.next(); boolean f1 = false;
				Iterator<String> it = arr.iterator();
			    //while (it.hasNext())
			    {//String st = it.next();
			    	//if(st == se )
			    	//{ 
			    		f1 = arr.removeIf(e->e.equals(se));
			    		//arr.remove(st);f1= true;
			    		 
			    	//}
			    }
			    if(f1 == true)
		        {
			    	System.out.println("Item deleted from the list");
			         
			        }
			    
			    if(f1 == false)
		        {
			    	System.out.println("Item not found in the list");
			         
			        }
			    break;
			case 4:
				System.out.println("The Items in the list are ");
				 it = arr.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());	
				}
				break;
			case 5: System.exit(0);
			break;
			}
		}while(true);
	}
}
}
