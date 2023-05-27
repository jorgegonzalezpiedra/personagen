package com.personagen.model.service.datosbancarios;

import org.springframework.stereotype.Service;

import com.personagen.generadorrandom.Randomizar;
import com.personagen.model.entity.datosbancarios.DatosBancarios;

@Service
public class DatosBancariosServiceImpl implements DatosBancariosService {

	@Override
	public DatosBancarios recuperarDatosBancariosRandom() throws Exception {

		DatosBancarios datosBancarios = Randomizar.datosBancariosRandom();

		return datosBancarios;
	}
}
