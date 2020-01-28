package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class arraylisexample 
{
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(2);
	         
	        list.add("Amal");
	        list.add("Binil");
	        list.add("Celine");
	        list.add("Disni");
	         
	        
	        Object[] array = list.toArray();
	         
	        System.out.println( Arrays.toString(array) );
	 
	        
	        for(Object o : array) {
	            String s = (String) o;
	             
	            System.out.println(s);
	        }
	    }
	}


