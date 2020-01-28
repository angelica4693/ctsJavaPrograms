package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class retainexample 
{  
	public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("Ami", "Abi", "Agil", "Diya", "Ajil"));
	         
	        System.out.println(alphabets);
	         
	        alphabets.retainAll(Collections.singleton("Ajil"));
	         
	        System.out.println(alphabets);
	    }
	}


