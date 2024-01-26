package com.muhammet.dto.response;

import com.muhammet.entity.views.VwCevap;
import com.muhammet.entity.views.VwSoru;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SoruGetAllResponseDto {
   VwSoru soru;
   List<VwCevap> cevaplar;

}
