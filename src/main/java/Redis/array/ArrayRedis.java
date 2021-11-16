package Redis.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayRedis {
    Map<String, ArrayList<String>> map;

    public ArrayRedis() {
        map = new HashMap<String, ArrayList<String>>();
    }


    public String add(String k, String v) {
        if (map.get(k) == null){
            ArrayList<String> value = new ArrayList<String>();
            value.add(v);
            map.put(k,value);
        }
        else {
            map.get(k).add(v);
        }
        return "OK";

    }

    public String get(String k) {
        return k + " : " + map.get(k).toString();
    }


    public void delete(String k) {

    }
}
