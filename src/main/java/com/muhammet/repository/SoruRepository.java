package com.muhammet.repository;

import com.muhammet.entity.Soru;
import com.muhammet.entity.YarismaUser;
import com.muhammet.entity.views.VwSoru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SoruRepository  extends JpaRepository<Soru,Long> {

    @Query("select new com.muhammet.entity.views.VwSoru(s.id,s.soru,s.sure,s.puan) from Soru  s where s.id=?1")
    VwSoru findAllByIdView(Long id);

    @Query("select new com.muhammet.entity.views.VwSoru(s.id,s.soru,s.sure,s.puan) from Soru  s")
    List<VwSoru> findAllView();
}
