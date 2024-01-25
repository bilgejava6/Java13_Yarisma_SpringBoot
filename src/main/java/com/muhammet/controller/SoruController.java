package com.muhammet.controller;

import com.muhammet.dto.request.SoruAddRequestDto;
import com.muhammet.service.CevapService;
import com.muhammet.service.SoruService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestApiUrls.*;
@RestController
@RequestMapping(SORU)
@RequiredArgsConstructor
public class SoruController {
    private final SoruService soruService;
    private final CevapService cevapService;
    @PostMapping(ADD)
    public ResponseEntity<Void> add(@RequestBody SoruAddRequestDto dto){

        System.out.println(dto.toString());

        return ResponseEntity.ok().build();
    }
}
