package com.muhammet.entity.views;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VwCevap {
    String cevap;
    String secenekNo;
    boolean dogruCevap;
}
