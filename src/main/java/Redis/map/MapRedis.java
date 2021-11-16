package Redis.map;

import java.util.HashMap;
import java.util.Map;

public class MapRedis {
    Map<String, HashMap<String,String>> map;

    public MapRedis() {
        map = new HashMap<>();
    }

    public String add(String k, String v1, String v2){
        if (map.get(k) == null){
            HashMap<String,String> value = new HashMap<>();
            value.put(v1,v2);
            map.put(k,value);
        }
        else {
            map.get(k).put(v1,v2);
        }
        return "OK";
    }

    public String get(String k){
        return k + " : " + map.get(k).toString();
    }
}
