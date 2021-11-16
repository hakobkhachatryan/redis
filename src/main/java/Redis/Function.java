package Redis;

import Redis.array.ArrayRedisService;
import Redis.map.MapRedisService;
import Redis.string.StringRedisService;

public class Function {
    StringRedisService stringRedisService = new StringRedisService();
    ArrayRedisService arrayRedisService = new ArrayRedisService();
    MapRedisService mapRedisService = new MapRedisService();

    public String select(String query){
        String result;
        String[] a = query.split(" ");
        switch (a[0]){
            case "set": 
                result = stringRedisService.add(query);
                break;
            case "get":
                result = stringRedisService.get(query);
                break;
            case "lpush":
                result = arrayRedisService.add(query);
                break;
            case "lrange":
                result = arrayRedisService.get(query);
                break;
            case "hset":
                result = mapRedisService.add(query);
                break;
            case "hget":
                result = mapRedisService.get(query);
                break;
            default:
                result = "ERR ERR syntax error";
        }
        
        return result;
    }
}
