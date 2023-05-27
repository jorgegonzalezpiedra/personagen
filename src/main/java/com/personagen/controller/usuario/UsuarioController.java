package com.personagen.controller.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personagen.model.entity.usuario.Usuario;
import com.personagen.model.service.usuario.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping(value = "user")
@Api(value = "${usuario.controller.titulo}")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@ApiOperation(value = "${usuario.controller.recuperarusuariorandom.descripcion}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok", response = Usuario.class),
			@ApiResponse(code = 500, message = "Error interno del servidor") })
	@GetMapping(value = "random-user", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> recuperarUsuarioRandom() {

		try {

			Usuario usuario = usuarioService.recuperarUsuarioRandom();
			return new ResponseEntity<>(usuario, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
