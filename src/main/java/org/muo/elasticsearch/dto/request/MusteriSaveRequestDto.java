package org.muo.elasticsearch.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MusteriSaveRequestDto {
    String ad;
    String soyad;
    Long yas;

}
