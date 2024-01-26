package com.muhammet.entity.views;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VwSoru {
    Long id;
    String soru;
    Integer sure;
    Integer puan;
}
