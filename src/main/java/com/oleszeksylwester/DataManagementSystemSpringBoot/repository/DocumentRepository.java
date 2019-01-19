package com.oleszeksylwester.DataManagementSystemSpringBoot.repository;

import com.oleszeksylwester.DataManagementSystemSpringBoot.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
