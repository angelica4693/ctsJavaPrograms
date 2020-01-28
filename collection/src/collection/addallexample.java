package collection;
import java.util.ArrayList;
public class addallexample 
{
 public static void main(String[] args) 
	    {
	        ArrayList<String> list1 = new ArrayList<>();    
	         
	        list1.add("Anna");
	        list1.add("Sharon");
	        list1.add("Angelica");
	        list1.add("jeeva");
	         
	        ArrayList<String> list2 = new ArrayList<>();    
	         
	        list2.add("Emil"); 
	        list2.add("Filo"); 
	         
	        list1.addAll(2, list2);  
	         
	        System.out.println(list1);      
	    }
	}


