import java.util.*;
package collection;

public class example3 
{
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.removeAll(Collections.singleton("A"));
	         
	        System.out.println(alphabets);
	    }
	}

