package com.intranet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intranet.entity.RolHasOpcion;
import com.intranet.entity.RolHasOpcionPK;

@Repository
public interface RolHasOpcionRepository extends JpaRepository<RolHasOpcion, RolHasOpcionPK>{

}
