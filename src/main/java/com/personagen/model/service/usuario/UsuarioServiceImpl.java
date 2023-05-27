package com.personagen.model.service.usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.mongodb.MongoException;
import com.personagen.generadorrandom.Randomizar;
import com.personagen.model.entity.datosbancarios.DatosBancarios;
import com.personagen.model.entity.direccion.Direccion;
import com.personagen.model.entity.usuario.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public Usuario recuperarUsuarioRandom() throws DataAccessException, MongoException {

		Usuario usuario = Randomizar.usuarioRandom();

		List<String> listTelefonos = obtenerTelefonos(2);
		List<Direccion> listDirecciones = obtenerDirecciones(1);
		List<DatosBancarios> listDatosBancarios = obtenerDatosBancarios(1);

		usuario.setTelefonos(listTelefonos);
		usuario.setDirecciones(listDirecciones);
		usuario.setDatosBancarios(listDatosBancarios);

		return usuario;

	}

	/**
	 * Metodo que devuelve un numero de direcciones aleatorias en funcion del
	 * parametro numeroDirecciones
	 * 
	 * @param numeroDirecciones int numero de direcciones que se quieren generar
	 * @return List<Direccion> direcciones generadas
	 */
	private List<Direccion> obtenerDirecciones(int numeroDirecciones) {

		List<Direccion> listDirecciones = new ArrayList<>();

		Direccion direccion = new Direccion();

		int i = 0;
		int numeroRegistros = new Random().nextInt(numeroDirecciones) + 1;

		// direcciones
		for (i = 0; i < numeroRegistros; i++) {
			direccion = Randomizar.direccionRandom();
			listDirecciones.add(direccion);
		}

		return listDirecciones;

	}

	/**
	 * Metodo que devuelve un numero de datos bancarios aleatorios en funcion del
	 * parametro numeroDirecciones
	 * 
	 * @param numeroDatosBancarios int numero de direcciones que se quieren generar
	 * @return List<Direccion> direcciones generadas
	 */
	private List<DatosBancarios> obtenerDatosBancarios(int numeroDatosBancarios) {

		List<DatosBancarios> listDatosBancarios = new ArrayList<>();

		DatosBancarios datosBancarios = new DatosBancarios();

		int i = 0;
		int numeroRegistros = new Random().nextInt(numeroDatosBancarios) + 1;

		// datos bancarios
		for (i = 0; i < numeroRegistros; i++) {
			datosBancarios = Randomizar.datosBancariosRandom();
			listDatosBancarios.add(datosBancarios);
		}

		return listDatosBancarios;

	}

	/**
	 * Metodo que devuelve un numero de datos bancarios aleatorios en funcion del
	 * parametro numeroDirecciones
	 * 
	 * @param numeroDatosBancarios int numero de direcciones que se quieren generar
	 * @return List<Direccion> direcciones generadas
	 */
	private List<String> obtenerTelefonos(int numeroTelefonos) {

		List<String> listTelefonos = new ArrayList<>();
		String telefono = "";

		int i = 0;
		int numeroRegistros = new Random().nextInt(numeroTelefonos) + 1;

		// datos bancarios
		for (i = 0; i < numeroRegistros; i++) {
			telefono = Randomizar.numeroTelefonoRandom();
			listTelefonos.add(telefono);
		}

		return listTelefonos;

	}
}
