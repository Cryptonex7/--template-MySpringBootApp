package com.example.mySpringBoot.repositories;

import com.example.mySpringBoot.models.tables.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MySpringBootRepository extends JpaRepository<MyEntity, String> {

    @Query("SELECT name from MyEntity")
    List<String> findAllNames();
}
