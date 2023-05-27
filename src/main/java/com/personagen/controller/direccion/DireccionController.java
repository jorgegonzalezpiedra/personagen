package com.personagen.controller.direccion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagen.model.entity.direccion.Direccion;
import com.personagen.model.service.direccion.DireccionService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping(value = "address")
public class DireccionController {

	@Autowired
	private DireccionService direccionService;

	@ApiOperation(value = "${direccion.controller.recuperardireccionrandom.descripcion}")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = Direccion.class),
			@ApiResponse(code = 500, message = "Error interno del servidor") })
	@GetMapping(value = "random-address", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> recuperarDireccionRandom() {

		try {

			Direccion direccion = direccionService.recuperarDireccionRandom();
			return new ResponseEntity<>(direccion, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
