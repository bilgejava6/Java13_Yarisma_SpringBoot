package com.muhammet.repository;

import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YarismaUserRepository extends JpaRepository<YarismaUser,Long> {
}
