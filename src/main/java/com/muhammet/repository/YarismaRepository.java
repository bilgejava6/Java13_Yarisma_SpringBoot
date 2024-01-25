package com.muhammet.repository;

import com.muhammet.entity.Yarisma;
import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YarismaRepository  extends JpaRepository<Yarisma,Long> {
}
