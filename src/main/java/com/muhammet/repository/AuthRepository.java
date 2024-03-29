package com.muhammet.repository;

import com.muhammet.entity.Auth;
import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository  extends JpaRepository<Auth,Long> {

    Boolean existsByUserName(String userName);
}
