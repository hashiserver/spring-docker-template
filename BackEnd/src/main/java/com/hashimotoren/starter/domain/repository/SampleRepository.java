package com.hashimotoren.starter.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashimotoren.starter.domain.model.Model;

public interface SampleRepository extends JpaRepository<Model, Long> {
}
