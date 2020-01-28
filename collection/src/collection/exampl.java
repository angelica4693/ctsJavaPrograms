package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class exampl
	{
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("adam", "binu", "celine", "david"));
	         
	        String firstName = list.get(0);        
	        String secondName = list.get(1);        
	        System.out.println(firstName);
	        System.out.println(secondName);
	    }
	}

