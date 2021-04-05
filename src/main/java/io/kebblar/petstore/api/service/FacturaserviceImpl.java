package io.kebblar.petstore.api.service;

//import java.util.ArrayList;
//import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import io.kebblar.petstore.api.exceptions.BusinessException;
import io.kebblar.petstore.api.mapper.FacturaMapper;
import io.kebblar.petstore.api.model.Factura;

@Service
public class FacturaserviceImpl implements FacturaService{

	private FacturaMapper facturaMapper;
	
	public FacturaserviceImpl(FacturaMapper facturaMapper) {
		this.facturaMapper = facturaMapper;
	}
	
	@Override
	public List<Factura> getAll() throws BusinessException {
		try {
			/*Factura f1 = new Factura(1, new Date(),"AESG771022XYZ",123,234.5,15);
			Factura f2 = new Factura(1, new Date(),"JSTA551201ABC",321,2434.5,14);
			List<Factura> resultado = new ArrayList<>();
			resultado.add(f1);
			resultado.add(f2);*/
			return facturaMapper.getAll();
		}catch (Exception e) {
			throw new BusinessException("texto adecuado...");
		}
	}

}
