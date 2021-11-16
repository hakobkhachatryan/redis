package Redis.string;

import java.util.HashMap;
import java.util.Map;

public class StringRedisService {

    StringRedis stringRedis;

    public StringRedisService() {
        stringRedis = new StringRedis();
    }

    public String add(String query){
        String[] a = query.split(" ");
        return stringRedis.add(a[1],a[2]);
    }

    public String get(String query){
        String[] a = query.split(" ");
        return stringRedis.get(a[1]);
    }

    public void delete(String k){
        stringRedis.delete(k);
    }


}
