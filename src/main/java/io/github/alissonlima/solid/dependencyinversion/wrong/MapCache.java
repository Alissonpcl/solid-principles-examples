package io.github.alissonlima.solid.dependencyinversion.wrong;

import java.util.HashMap;
import java.util.Map;

public class MapCache {

    private static final Map<Integer, Object> mapCache = new HashMap<>();

    public static void put(Integer id, Object value){
        mapCache.put(id, value);
    }
}
