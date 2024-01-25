package com.muhammet.repository;

import com.muhammet.entity.User;
import com.muhammet.entity.YarismaUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
