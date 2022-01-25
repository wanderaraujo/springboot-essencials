package com.araujo.springbootessentialsmodule2.repository;

import com.araujo.springbootessentialsmodule2.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

    List<Anime> findByName(String name);
}
