package com.muhammet.service;

import com.muhammet.repository.CevapRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CevapService {
    private final CevapRepository cevapRepository;

}
