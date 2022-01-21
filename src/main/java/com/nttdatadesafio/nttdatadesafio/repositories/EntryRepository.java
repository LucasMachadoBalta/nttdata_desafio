
package com.nttdatadesafio.nttdatadesafio.repositories;

import com.nttdatadesafio.nttdatadesafio.models.EntryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntryRepository extends JpaRepository<EntryEntity, Long> {

    Optional<EntryEntity> findById(Long id);

}

