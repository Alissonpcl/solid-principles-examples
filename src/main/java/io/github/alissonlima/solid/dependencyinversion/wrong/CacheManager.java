package io.github.alissonlima.solid.dependencyinversion.wrong;

public class CacheManager {
    //ERRADO
    //Veja que aqui nosso CacheManager que é uma classe de alto nível
    //está fortemente vinculada a implementações finais de dependências
    //de baixo nível.
    //Isso faz com que case queiramos alterar nosso cache de MapCache para
    //ListCache seja necessário alterar nossa implementação.
    public static void addToCache(int id, Object value){
        MapCache.put(id, value);
    }
}
