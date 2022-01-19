package com.nttdatadesafio.nttdatadesafio.repository;

import com.nttdatadesafio.nttdatadesafio.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

    List<CategoryModel> findAllById(Long id);
}
