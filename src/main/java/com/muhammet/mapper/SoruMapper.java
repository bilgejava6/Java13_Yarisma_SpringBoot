package com.muhammet.mapper;

import com.muhammet.dto.request.SoruAddRequestDto;
import com.muhammet.entity.Soru;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SoruMapper {
    SoruMapper INSTANCE = Mappers.getMapper(SoruMapper.class);

    Soru fromSoruRequestDto(final SoruAddRequestDto dto);
}
