package com.muhammet.service;

import com.muhammet.dto.request.SoruAddRequestDto;
import com.muhammet.entity.Cevap;
import com.muhammet.repository.CevapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CevapService {
    private final CevapRepository cevapRepository;

    public void save(Long soruId, List<SoruAddRequestDto.SoruCevap> cevapList) {
        cevapList.forEach(cevap->            
            cevapRepository.save(
                    Cevap.builder()
                            .soruId(soruId)
                            .secenekNo(cevap.getSecenekNo())
                            .dogruCevap(cevap.isDogruCevap())
                            .cevap(cevap.getCevap())
                            .build()
            )            
        );
    }
}
