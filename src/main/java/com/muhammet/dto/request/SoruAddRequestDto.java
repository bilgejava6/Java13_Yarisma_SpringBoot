package com.muhammet.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SoruAddRequestDto {
    String soru;
    int sure;
    int puan;
    List<SoruCevap> cevapList;
    @Data
    public static class SoruCevap{
        String cevap;
        String secenekNo;
        boolean dogruCevap;
    }

}
