package com.example.SimpleConfessions.Repository;

import com.example.SimpleConfessions.Entity.Confessions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConfessionsRepository extends JpaRepository<Confessions,Long>{
}
