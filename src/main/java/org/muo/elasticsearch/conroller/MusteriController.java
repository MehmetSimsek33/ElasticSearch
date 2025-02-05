package org.muo.elasticsearch.conroller;

import lombok.RequiredArgsConstructor;
import org.muo.elasticsearch.entity.Musteri;
import org.muo.elasticsearch.repository.MusteriRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/musteri")
public class MusteriController{
//    private final MusteriRepository musteriRepository;
//
//    @GetMapping("/save")
//    public void save() {
//        musteriRepository.save(Musteri.builder().name("deneme").build());
//    }
}
