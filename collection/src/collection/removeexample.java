package collection;
import java.util.ArrayList;
import java.util.Arrays;
 public class removeexample 
 {
	 public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("L","M","N","O"));
	         System.out.println(alphabets);
	         alphabets.remove("N");         
	         System.out.println(alphabets);
	         alphabets.remove("Z");          
	         System.out.println(alphabets);
	    }
	}


