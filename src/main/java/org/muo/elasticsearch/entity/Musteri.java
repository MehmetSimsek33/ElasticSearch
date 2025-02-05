package org.muo.elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "musteri")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Musteri {

    @Id
    String id;
    String name;
}
