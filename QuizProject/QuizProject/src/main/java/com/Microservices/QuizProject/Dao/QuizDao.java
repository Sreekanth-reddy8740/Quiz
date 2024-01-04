package com.Microservices.QuizProject.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Microservices.QuizProject.Model.QuizEntity;

@Repository
public interface QuizDao extends JpaRepository<QuizEntity, Integer> {

}
