package io.github.alissonlima.solid.dependencyinversion.wrong;

import java.util.ArrayList;
import java.util.List;

public class ListCache {

    private static final List<Object> listCache = new ArrayList<>();

    public static void add (int id, Object value) {
        listCache.set(id, value);
    }
}
