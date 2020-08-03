package com.ashish.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
