import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HahMapInJava {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //inserting in map
        map.put("India",100);
        map.put("U.S.",70);
        System.out.println(map);
        map.put("U.S.",100);
        System.out.println(map);
        //searching in map
        System.out.println(map.get("India"));
        if(map.containsKey("India")){
            System.out.println("Map contains your key");
        }
        //iteration in map
        //for iterating in array other way 
        int arr[] ={1,2,3};
        for(int val: arr){
            System.out.println(val);
        }
        //similiarly we can iterate in map
        for(Map.Entry<String,Integer> e : map.entrySet() ){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //to get ony the key in the map
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }
        //deleting from map
        map.remove("U.S.");
        System.out.println(map);
    }
}
