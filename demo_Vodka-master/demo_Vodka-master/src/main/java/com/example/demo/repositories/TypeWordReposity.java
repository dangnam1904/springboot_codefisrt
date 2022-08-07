package com.example.demo.repositories;

import com.example.demo.models.TypeWord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeWordReposity extends JpaRepository<TypeWord, Long> {
}
