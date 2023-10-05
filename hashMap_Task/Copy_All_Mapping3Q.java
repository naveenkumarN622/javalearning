package hashMap_Task;

import java.util.HashMap;

public class Copy_All_Mapping3Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hash_Map1= new HashMap<Integer,String>();
		HashMap<Integer, String> hash_Map2= new HashMap<Integer,String>();
		hash_Map1.put(1," benz");
		hash_Map1.put(2," audi");
		hash_Map1.put(3," bmw");
		System.out.println("\n Values in first map :" + hash_Map1 );
		hash_Map2.put(4," abc");
		hash_Map2.put(5," bca");
		hash_Map2.put(6," cab");
		System.out.println("\n Values in second map :" + hash_Map2 );
		
		hash_Map2.putAll(hash_Map1);
		System.out.println("\n value in second map:"+hash_Map2);

		

	}

}
