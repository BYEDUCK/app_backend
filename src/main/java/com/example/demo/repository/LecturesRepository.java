package com.example.demo.repository;

import com.example.demo.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LecturesRepository extends JpaRepository<Lecture, Integer> {

    Optional<Lecture> findById(int id);

    Optional<Lecture> findByAbbreviation(String abbreviation);

}
