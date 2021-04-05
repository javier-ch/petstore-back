package io.kebblar.petstore.api.service;

import java.util.List;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.model.Factura;

public interface FacturaService {

	/**
	 * Regresa la totalidad de facturas almacenadas en la base de datos
	 * 
	 * @return Lista de objetos de tipo factura
	 * @throws BusinessException Se dispara en caso de alun error en el proceso
	 */
	List<Factura> getAll() throws BusinessException;
}
