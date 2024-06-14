package com.intranet.service;

import java.util.List;

import com.intranet.entity.DataCatalogo;

public interface DataCatalogoService {
	public abstract List<DataCatalogo> listaDataCatalogo(int idTipo);
}
