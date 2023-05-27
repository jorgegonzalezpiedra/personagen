package com.personagen.model.service.direccion;

import org.springframework.stereotype.Service;

import com.personagen.generadorrandom.Randomizar;
import com.personagen.model.entity.direccion.Direccion;

@Service
public class DireccionServiceImpl implements DireccionService {

	@Override
	public Direccion recuperarDireccionRandom() throws Exception {

		Direccion direccion = Randomizar.direccionRandom();

		return direccion;
	}
}
