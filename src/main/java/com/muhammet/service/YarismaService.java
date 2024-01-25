package com.muhammet.service;

import com.muhammet.repository.YarismaRepository;
import com.muhammet.repository.YarismaSoruRepository;
import com.muhammet.repository.YarismaUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YarismaService {
    private final YarismaRepository yarismaRepository;
    private final YarismaSoruRepository yarismaSoruRepository;
    private final YarismaUserRepository yarismaUserRepository;
}
