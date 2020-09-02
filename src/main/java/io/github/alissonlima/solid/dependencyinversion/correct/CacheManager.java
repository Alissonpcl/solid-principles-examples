package io.github.alissonlima.solid.dependencyinversion.correct;

public class CacheManager {
    private final Cacheator cacheator;

    public CacheManager(Cacheator cacheator) {
        this.cacheator = cacheator;
    }

    //CORRETO
    //Aqui nosso CacheManager está vinculado a uma abstração de nossas
    //implemementações de Cache. Assim é possível adicionar novos tipos
    //de caches em nossa aplicação sem precisar alterar nosso manager.
    public void addToCache(int id, Object value){
        cacheator.put(id, value);
    }
}
