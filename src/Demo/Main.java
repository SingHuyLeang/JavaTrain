package Demo;

import java.util.*;
/*
    Map<Key,Value>
*   Key
* */

// SELECT * FROM
/*
    Flutter x List ft Map
    Java ArrayList ft HasTable
 */
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // Note* : key of map use only lower case
        //add data to map use .put(key,value);
        map.put("apple",10);
        map.put("banana",5);
        map.put("orange",20);

        // update value in map it catch by key use .replace
        map.replace("banana",15);

        // remove by key
        map.remove("apple");

        //get data from map .get(key)
        /*
            System.out.println(
                    "Apple    : "+map.get("apple")+"\n"+
                    "Banana   : "+map.get("banana")+"\n"+
                    "Orange   : "+map.get("orange")+"\n"
            );
        */
//        Can use .forEach() for show data
        map.forEach((key, value) -> {
            System.out.println(key+"\t"+value);
        } );
    }
}
/*
    API fetch data push use Map
    Json
 */