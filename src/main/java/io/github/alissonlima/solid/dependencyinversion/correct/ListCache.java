package io.github.alissonlima.solid.dependencyinversion.correct;

import java.util.ArrayList;
import java.util.List;

public class ListCache implements Cacheator{

    private static final List<Object> listCache = new ArrayList<>();

    @Override
    public void put(Integer id, Object value) {
        listCache.set(id, value);
    }
}
