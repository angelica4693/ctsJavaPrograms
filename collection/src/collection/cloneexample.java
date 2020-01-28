package collection;
import java.util.ArrayList;
public class cloneexample 
{
	 //@SuppressWarnings("unchecked")
	    public static void main(String[]args) 
	    {
	        ArrayList<String> arrayListObject = new ArrayList<>(); 
	         
	        arrayListObject.add("Anu");
	        arrayListObject.add("Bindu");
	        arrayListObject.add("Celin");
	        arrayListObject.add("Denny");
	         
	        System.out.println(arrayListObject);   
	         
	        ArrayList<String> arrayListClone =  (ArrayList<String>) arrayListObject.clone();
	         
	        System.out.println(arrayListClone);   
	    }
	}


