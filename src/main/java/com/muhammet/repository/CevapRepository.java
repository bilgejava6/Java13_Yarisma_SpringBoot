package com.muhammet.repository;

import com.muhammet.entity.Cevap;
import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CevapRepository  extends JpaRepository<Cevap,Long> {
}
