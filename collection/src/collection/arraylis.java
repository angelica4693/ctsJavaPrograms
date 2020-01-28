package collection;
import java.util.*;

public class arraylis 
{

	public static void main(String[] args)
	{
	ArrayList<String>lis1=new ArrayList();//list1
		lis1.add("Anu");
		lis1.add("Ajil");
		lis1.add("Aju");
		lis1.add("Ami");
		lis1.add("Abi");
		ArrayList<String>lis2=new ArrayList();//list2
		lis2.add("swathi");
		lis2.add("Sijo");
		lis2.add("Sophy");
		lis2.add("Sima");
		lis2.add("sisy");
		
		lis2.add("sini");
		lis1.addAll(lis2);
		// TODO Auto-generated method stub
System.out.println(lis1);
	}
	

}
