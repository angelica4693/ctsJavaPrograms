package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class removeifexample 

	{
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	 
	        numbers.removeIf( number -> number%2 == 0 );
	         System.out.println(numbers);
	    }
	}
	
	
	

