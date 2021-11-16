package Redis.string;

import java.util.HashMap;
import java.util.Map;

public class StringRedis {

    Map<String,String> map;

    public StringRedis(){
        map = new HashMap<String, String>();
    }


    public String add(String k, String v) {
        map.put(k,v);
        return "OK";
    }

    public String get(String k) {
        return k + " : " + map.get(k);
    }

//    public String update(String k, String v) {
//        map.put(k,v);
//        return "OK";
//    }

    public String delete(String k) {
        map.remove(k);
        return "OK";
    }
}
