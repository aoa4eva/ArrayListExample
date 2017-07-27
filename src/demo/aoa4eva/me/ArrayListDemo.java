package demo.aoa4eva.me;

import java.util.ArrayList;

public class ArrayListDemo {
	/**
	 * This application demonstrates how to add to, remove from, and iterate through arrays in Java, using an enhanced for loop
	 * @author aoa4eva
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array list variable 
		ArrayList <String> myArrayList; 
		
		//Initialize the array - this can also be done in one line. 
		myArrayList = new ArrayList <String>();
		
		//Add to myArrayList 
		myArrayList.add("One");
		myArrayList.add("T!.&20Two");
		myArrayList.add(".123.Three");
		myArrayList.add("Four$$");
		myArrayList.add("!!Five!!");
		myArrayList.add("This is an f test");

		System.out.println("==========================================================================================================");
		//Display  items in an array list using an enhanced for loop 
		for(String item:myArrayList)
		{
			System.out.println("This is an item in an arraylist:"+item);
		
		}
		System.out.println("==========================================================================================================");
		
		//Remove an item from the array list 
		myArrayList.remove("One");
		
		System.out.println("Deleted an item from the array list: 'One' ");
		
		for(String item:myArrayList)
		{
			System.out.println("This is an item in an arraylist:"+item);
		
		}
		System.out.println("==========================================================================================================");
		
		myArrayList.remove("Five");
		
		System.out.println("Java will ignore you if the value does not exist");
		
		for(String item:myArrayList)
		{
			System.out.println("This is an item in an arraylist:"+item);
		
		}
	
		System.out.println("==========================================================================================================");
		//Using lambda expressions and the for each method in Array Lists

		myArrayList.forEach(item->{
				if(item.contains("T"))
				{
					System.out.println(item+" contains a T");
				}else{
					System.out.println("This is an item in an arraylist that uses lambda expressions:"+item);
				}});
		
		System.out.println("==========================================================================================================");
		//Using lambda expressions and the for each method in Array Lists
		myArrayList.forEach(item->{
				if(item.contains("f"))
				{	//DON'T DELETE THIS WAY!! You cannot delete items from a collection you are iterating over
					System.out.println("DO NOT DELET THHIS WAY");
					System.out.println(item+" contains an f and will be deleted");
					myArrayList.remove(item);
				}else{
					System.out.println("This is an item in an arraylist that uses lambda expressions:"+item);
				}});
		
	}

}


