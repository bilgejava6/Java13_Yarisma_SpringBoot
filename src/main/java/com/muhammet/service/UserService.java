package com.muhammet.service;

import com.muhammet.entity.User;
import com.muhammet.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private  final UserRepository userRepository;
    public void save(Long id, String email) {
        User user = User.builder()
                .email(email)
                .authId(id)
                .build();
        userRepository.save(user);
    }
}
