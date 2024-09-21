package com.example.excel_parsing_application.repositories;

import com.example.excel_parsing_application.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepo extends JpaRepository<Persons, Long> {

}
