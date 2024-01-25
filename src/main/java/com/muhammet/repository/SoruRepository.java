package com.muhammet.repository;

import com.muhammet.entity.Soru;
import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoruRepository  extends JpaRepository<Soru,Long> {
}
