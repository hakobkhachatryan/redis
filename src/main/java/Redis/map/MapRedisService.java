package Redis.map;

public class MapRedisService {
    MapRedis mapRedis;

    public MapRedisService() {
        mapRedis = new MapRedis();
    }

    public String add(String query){
        String[] a = query.split(" ");
        return mapRedis.add(a[1],a[2],a[3]);
    }
    public String get(String query){
        String[] a = query.split(" ");
        return mapRedis.get(a[1]);
    }
}
