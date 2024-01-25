package com.muhammet.service;

import com.muhammet.dto.request.RegisterRequestDto;
import com.muhammet.entity.Auth;
import com.muhammet.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthRepository authRepository;

    /**
     * Bir kullanıcı yeni kayıt olduğunda auth bilgileri
     * user oluşturmak için kullanılacaktır. bu nedenle işlem yapıldıktan
     * sonra auth bilgisi geri dönülür.
     * @param dto
     * @return
     */
    public Auth save(RegisterRequestDto dto) {
        Auth auth = Auth.builder()
                .userName(dto.getUserName())
                .password(dto.getPassword())
                .build();
        return authRepository.save(auth); // NOT!! save işlemi kayıt ettiği nesneyi döner.
    }
}
