package org.muo.elasticsearch.repository;

import org.muo.elasticsearch.entity.Musteri;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;


public interface MusteriRepository extends ElasticsearchRepository<Musteri,String> {
}
