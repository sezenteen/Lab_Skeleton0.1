package com.example.lab_skeleton.repository;

import com.example.lab_skeleton.entity.Shampoo;
import org.hibernate.engine.jdbc.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShampooRepository extends JpaRepository<Shampoo, Long> {

    List<Shampoo> findShampooByBrand(String brand);
    List<Shampoo> getAllBySizeOrderById(Size size);

    @Query("select s from Shampoo as s where s.brand")
    List<Shampoo> getshampoos(String brand);
}
