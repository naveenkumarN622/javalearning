package hashMap_Task;

import java.util.HashMap;

public class Contain_Specified_Value7Q {
	  public static void main(String args[]) {
		  HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
		  hash_map.put(1, "A");
		  hash_map.put(2, "G");
		  hash_map.put(3, "B");
		  hash_map.put(4, "W");
		  hash_map.put(5, "B");
		  // print the map
		  System.out.println("The Original map: " + hash_map);
		  System.out.println("1. Is value \'G\' exists?");
		  if (hash_map.containsValue("G")) {
		   //value exists
		   System.out.println("Yes! ");
		  } else {
		   //value does not exists
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is value \'B\' exists?");
		  if (hash_map.containsValue("M")) {
			  System.out.println("yes! - " );
		  } else {
		   System.out.println("No!");
		  }
		 }
	}
		  

