package hashMap_Task;

import java.util.HashMap;

public class HashMap_Instance6Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String >hash_Map=new HashMap<Integer,String>();
hash_Map.put(1,"oppo");
hash_Map.put(2,"vivo");
hash_Map.put(3,"realme");
System.out.println("the map:"+hash_Map);
HashMap<Integer, String>new_hash_Map=new HashMap<Integer,String>(); 
new_hash_Map=(HashMap)hash_Map.clone();
System.out.println("cloned map:"+ new_hash_Map);
	}

}
