package com.muhammet.controller;

import com.muhammet.dto.request.RegisterRequestDto;
import com.muhammet.entity.Auth;
import com.muhammet.service.AuthService;
import com.muhammet.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.muhammet.constants.RestApiUrls.*;
@RestController
@RequestMapping(AUTH)
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final AuthService authService;

    @PostMapping(REGISTER)
    public ResponseEntity<Boolean> register(@RequestBody @Valid RegisterRequestDto dto){
        Auth auth = authService.save(dto);
        userService.save(auth.getId(),dto.getEmail());
        return ResponseEntity.ok(true);
    }

}
