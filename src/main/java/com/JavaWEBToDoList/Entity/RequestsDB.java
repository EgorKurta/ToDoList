package com.JavaWEBToDoList.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsDB extends JpaRepository<Deal, Long> {}