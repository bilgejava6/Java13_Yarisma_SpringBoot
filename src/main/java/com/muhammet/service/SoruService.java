package com.muhammet.service;

import com.muhammet.dto.request.SoruAddRequestDto;
import com.muhammet.dto.response.SoruGetAllResponseDto;
import com.muhammet.entity.Cevap;
import com.muhammet.entity.Soru;
import com.muhammet.entity.views.VwCevap;
import com.muhammet.entity.views.VwSoru;
import com.muhammet.mapper.SoruMapper;
import com.muhammet.repository.CevapRepository;
import com.muhammet.repository.SoruRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class SoruService {
    private final SoruRepository soruRepository;
    private final CevapRepository cevapRepository;
    public List<Soru> findAll() {
        return soruRepository.findAll();
    }

    public Soru save(SoruAddRequestDto dto) {
//        Soru soru = Soru.builder()
//                .soru(dto.getSoru())
//                .sure(dto.getSure())
//                .puan(dto.getPuan())
//                .build();
//        return soruRepository.save(soru);
        return  soruRepository.save(SoruMapper.INSTANCE.fromSoruRequestDto(dto));
    }

    public List<SoruGetAllResponseDto> findAllOrById(Long id) {
        List<SoruGetAllResponseDto> result = new ArrayList<>();
        if(Objects.isNull(id)){
            List<VwSoru> allView = soruRepository.findAllView(); // bütün soruların listesi
            allView.forEach(vwSoru -> addResult(vwSoru, result));
        }else{
            VwSoru vwSoru = soruRepository.findAllByIdView(id);
            addResult(vwSoru, result);
        }
        return result;
    }

    private void addResult(VwSoru vwSoru, List<SoruGetAllResponseDto> result) {
        List<VwCevap> allCevapList = cevapRepository.findAllBySoruIdView(vwSoru.getId());
        SoruGetAllResponseDto dto = SoruGetAllResponseDto.builder()
                .soru(vwSoru)
                .cevaplar(allCevapList)
                .build();
        result.add(dto);
    }
}
