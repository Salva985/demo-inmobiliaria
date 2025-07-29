package com.example.demo.repository;

import com.example.demo.model.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquilinoRepository extends JpaRepository<Inquilino, Long> {
}
