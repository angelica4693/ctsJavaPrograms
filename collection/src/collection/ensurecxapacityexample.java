package collection;
import java.util.*;
public class ensurecxapacityexample 
{
	public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(2);
         
        list.add("A");
        list.add("B");
         
        System.out.println(list);
         
        list.ensureCapacity(20);
         
        list.add("C");
        list.add("D");
        list.add("E");
 
        System.out.println(list);
    }
}	
	
	
	


