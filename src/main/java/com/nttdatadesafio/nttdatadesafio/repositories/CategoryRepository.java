package com.nttdatadesafio.nttdatadesafio.repositories;

import com.nttdatadesafio.nttdatadesafio.models.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Optional<CategoryEntity> findById(Long id);

    //List<CategoryModel> saveById(Long id);

}
