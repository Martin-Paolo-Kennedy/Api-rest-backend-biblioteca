package com.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.entity.Rol;


@Repository

public interface RolRepository extends JpaRepository<Rol, Integer>{

}
