package com.muhammet.controller;

import com.muhammet.dto.request.SoruAddRequestDto;
import com.muhammet.dto.response.SoruGetAllResponseDto;
import com.muhammet.entity.Soru;
import com.muhammet.service.CevapService;
import com.muhammet.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.muhammet.constants.RestApiUrls.*;
@RestController
@RequestMapping(SORU)
@RequiredArgsConstructor
public class SoruController {
    private final SoruService soruService;
    private final CevapService cevapService;
    @PostMapping(ADD)
    public ResponseEntity<Void> add(@RequestBody SoruAddRequestDto dto){
        Soru soru = soruService.save(dto);
        cevapService.save(soru.getId(),dto.getCevapList());
        return ResponseEntity.ok().build();
    }

    @GetMapping(GET_ALL)
    public ResponseEntity<List<SoruGetAllResponseDto>> getAll(Long id){
        return  ResponseEntity.ok(soruService.findAllOrById(id));
    }


}
