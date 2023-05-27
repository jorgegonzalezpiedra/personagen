package com.personagen.controller.datosbancarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagen.model.entity.datosbancarios.DatosBancarios;
import com.personagen.model.service.datosbancarios.DatosBancariosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping(value = "bankdata")
public class DatosBancariosController {

	@Autowired
	private DatosBancariosService datosBancariosService;

	@ApiOperation(value = "${datosbancarios.controller.recuperardatosbancariosrandom.descripcion}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = DatosBancarios.class),
			@ApiResponse(code = 500, message = "Error interno del servidor") })
	@GetMapping(value = "/random-bankdata", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> recuperarDatosBancariosRandom() {

		try {

			DatosBancarios datosBancarios = datosBancariosService.recuperarDatosBancariosRandom();
			return new ResponseEntity<>(datosBancarios, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
