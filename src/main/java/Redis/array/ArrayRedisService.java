package Redis.array;

import Redis.string.StringRedis;

public class ArrayRedisService {
    ArrayRedis arrayRedis;

    public ArrayRedisService() {
        arrayRedis = new ArrayRedis();
    }

    public String add(String query){
        String[] a = query.split(" ");
        return arrayRedis.add(a[1],a[2]);

    }

    public String get(String query){
        String[] a = query.split(" ");
        return arrayRedis.get(a[1]);
    }
}
