package com.packt.maystore.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.packt.maystore.domain.TestEntity;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
