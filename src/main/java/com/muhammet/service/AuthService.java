package com.muhammet.service;

import com.muhammet.dto.request.RegisterRequestDto;
import com.muhammet.entity.Auth;
import com.muhammet.exception.ErrorType;
import com.muhammet.exception.YarismaAppException;
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
        if(authRepository.existsByUserName(dto.getUserName()))
            throw new YarismaAppException(ErrorType.ERROR_DUPLICATE_USERNAME);
        Auth auth = Auth.builder()
                    .userName(dto.getUserName())
                    .password(dto.getPassword())
                    .build();
        return authRepository.save(auth); // NOT!! save işlemi kayıt ettiği nesneyi döner.

    }
}
