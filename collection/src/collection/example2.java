package collection;
import java.util.ArrayList;
import java.util.Arrays;
 
public class example2 
{
	public class ArrayListExample 
	{
	    public static void main(String[] args)
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.remove("C");          
	         
	        System.out.println(alphabets);
	        alphabets.remove("Z");          
	        System.out.println(alphabets);
	    }
	}	
	

}
