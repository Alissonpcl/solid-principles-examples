package io.github.alissonlima.solid.dependencyinversion.correct;

import java.util.HashMap;
import java.util.Map;

public class MapCache implements Cacheator{

    private static final Map<Integer, Object> mapCache = new HashMap<>();

    @Override
    public void put(Integer id, Object value) {
        mapCache.put(id, value);
    }
}
