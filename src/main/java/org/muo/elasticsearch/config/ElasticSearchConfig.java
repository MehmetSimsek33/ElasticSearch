package org.muo.elasticsearch.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;



//@Configuration
//@EnableElasticsearchRepositories(basePackages ="org.muo.elasticsearch.repository")
public class ElasticSearchConfig {

}

//    @Override
//    public ClientConfiguration clientConfiguration() {
//        return ClientConfiguration.builder()
//                .connectedTo("localhost:9200")
//                .usingSsl()
//                .build();
//    }
//}

//public class ElasticSearchConfig{
//g
//}
