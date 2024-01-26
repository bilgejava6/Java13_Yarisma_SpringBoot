package com.muhammet.repository;

import com.muhammet.entity.Cevap;
import com.muhammet.entity.YarismaUser;
import com.muhammet.entity.views.VwCevap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CevapRepository  extends JpaRepository<Cevap,Long> {
    List<Cevap> findAllBySoruId(Long id);

    @Query("select new com.muhammet.entity.views.VwCevap(c.cevap,c.secenekNo,c.dogruCevap) from Cevap c where c.soruId= ?1")
    List<VwCevap> findAllBySoruIdView(Long soruId);
}
