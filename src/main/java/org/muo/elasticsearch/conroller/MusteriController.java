package org.muo.elasticsearch.conroller;

import lombok.RequiredArgsConstructor;
import org.muo.elasticsearch.dto.request.MusteriSaveRequestDto;
import org.muo.elasticsearch.entity.Musteri;
import org.muo.elasticsearch.repository.MusteriRepository;
import org.muo.elasticsearch.service.MusteriService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static  org.muo.elasticsearch.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(MUSTERI)
public class MusteriController{
    private final MusteriService musteriService;


    @PostMapping(SAVE)
    public ResponseEntity<Musteri> save(@RequestBody MusteriSaveRequestDto dto) {
        Musteri musteri = musteriService.save(dto);
        return  ResponseEntity.ok(musteri);
    }

    @GetMapping(GETALL)
    public ResponseEntity<Iterable<Musteri>> getAll() {

        return ResponseEntity.ok(musteriService.findAll());
    }
}
