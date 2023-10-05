package hashMap_Task;

import java.util.HashMap;

public class MapCointais5Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>hash_Map=new HashMap<Integer,String>();
hash_Map.put(1,"oreao");
hash_Map.put(1,"dark fantacy");
hash_Map.put(1,"jimgam");
Boolean result=hash_Map.isEmpty();
System.out.println("the has map is empty:"+result);
hash_Map.clear();
result= hash_Map.isEmpty();
System.out.println("the hash map is empty: "+result);

	}

}
