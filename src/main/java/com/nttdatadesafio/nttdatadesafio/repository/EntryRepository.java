
package com.nttdatadesafio.nttdatadesafio.repository;

import com.nttdatadesafio.nttdatadesafio.entity.EntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {

    List<EntryEntity> findAllById(Long id);

}

