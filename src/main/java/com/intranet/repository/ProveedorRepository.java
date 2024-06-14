package com.intranet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intranet.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
	@Query("select x from Proveedor x where x.razonsocial like ?1")
    public List<Proveedor> listaPorNombre(String nombre);
	
	@Query("select x from Proveedor x where (x.razonsocial like ?1) and "
			+ "(?2 = '' or x.celular = ?2) and "
			+ "(x.estado = ?3) and "
			+ "(?4 = -1 or x.tipoProveedor.idDataCatalogo = ?4)")
	public List<Proveedor> listaConsultaDinamica(String razonsocial, String celular, int estado,int idTipoProveedor);
}
