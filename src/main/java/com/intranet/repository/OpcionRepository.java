package com.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.entity.Opcion;

@Repository
public interface OpcionRepository extends JpaRepository<Opcion, Integer>{

}
