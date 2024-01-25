package com.muhammet.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterRequestDto {
    @NotNull
    @Size(min = 3,max = 64)
    String userName;
    @NotNull
    @Email
    String email;
    @NotNull
    @Size(min = 8)
    String password;
    @NotNull
    @Size(min = 8)
    String rePassword;
}
