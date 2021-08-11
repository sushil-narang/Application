package com.springboot.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.application.model.LogModel;

public interface LogModelRepository extends JpaRepository<LogModel, String> {

}
