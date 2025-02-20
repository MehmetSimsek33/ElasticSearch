package org.muo.elasticsearch.service;

import lombok.RequiredArgsConstructor;
import org.muo.elasticsearch.dto.request.MusteriSaveRequestDto;
import org.muo.elasticsearch.entity.Musteri;
import org.muo.elasticsearch.repository.MusteriRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MusteriService {
    private final MusteriRepository musteriRepository;

    public Iterable<Musteri> findAll() {
        return musteriRepository.findAll();
    }


    public Musteri save(MusteriSaveRequestDto dto) {
        Musteri musteri =musteriRepository.save(Musteri.builder()
                        .ad(dto.getAd())
                        .soyad(dto.getSoyad())
                        .adsoyad(dto.getAd()+"_"+dto.getSoyad())
                        .yas(dto.getYas())
                        .isActive(true)
                .build());
            return musteri;




    }
}
