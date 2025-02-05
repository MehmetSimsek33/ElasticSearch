# ELASTICSEARCH

## BAGLANTI TÜRLERİ VE KONFİGURASYONLARI

### 1 SingleNode ElasticSearch Bağlantı yöntemleri 
    singlenode üzerinde ssl pasif edildiği ve username şifr girilmediği için 
    bağlantılar konusunda çok sorun yaşanmaktadı. Bir spring projesini elasticsearch
    bağlamak  isityorsak ek bir ayar yapmadan direkt bağlamak mümkündür.
    Spring Starter genellikle uygulamaların defaul yapılandırmalarını kullanarak
    initialize yapar.
      Ancak eğer farklı bir adres, port, güvenlik ayarları barındırıyorsa elle
    bu YML configurasyonu ile bağlamak 
```yml
spring:
  elasticsearch:
    uris: https://localhost:9200
    username: elastic
    password: Aa123456**
```
    Spring boot Configuration Bean ile bağlamak:
```java

@Configurable
public class ElasticSearchConfig extends ElasticsearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo("localhost:9200")
               //single modda kullanıyorsak yazabiliriz .usingSsl()
                .build();
    }
}
```


    
