package com.personagen.generadorrandom;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;
import com.personagen.model.entity.datosbancarios.DatosBancarios;
import com.personagen.model.entity.direccion.Direccion;
import com.personagen.model.entity.usuario.Usuario;

public class Randomizar {

	private static Faker faker = new Faker(new Locale("es"));

	public static Usuario usuarioRandom() {

		Usuario usuario = Usuario.builder().id(faker.idNumber().ssnValid()).nombre(faker.name().firstName())
				.apellido1(faker.name().lastName()).apellido2(faker.name().lastName()).dni(dniRandom()).nie(nieRandom())
				.nacionalidad(faker.nation().nationality()).email(faker.internet().emailAddress())
				.fechaNacimiento(new SimpleDateFormat("dd/MM/yyyy").format(faker.date().birthday(18, 99)))
				.nombreUsuario(faker.name().username()).build();

		return usuario;
	}

	public static Direccion direccionRandom() {

		Direccion direccion = Direccion.builder().tipoVia("Calle").nombreVia(faker.address().streetName())
				.numeroVia(String.valueOf(faker.number().numberBetween(1, 200)))
				.numeroPiso(String.valueOf(faker.number().numberBetween(1, 20))).letraPiso(faker.regexify("[A-F]"))
				.pais(faker.address().country()).codigoPostal(faker.address().zipCode())
				.provincia(faker.address().state()).municipio(faker.address().cityName()).build();

		return direccion;
	}

	public static DatosBancarios datosBancariosRandom() {

		DatosBancarios datosBancarios = DatosBancarios.builder().bic(faker.finance().bic()).iban(faker.finance().iban())
				.numeroTarjeta(faker.finance().creditCard()).fechaCaducidad(faker.business().creditCardExpiry())
				.cvv(cvvRandom()).nombreTitular(faker.name().fullName()).build();

		return datosBancarios;
	}

	public static String numeroTelefonoRandom() {

		return faker.phoneNumber().phoneNumber();
	}

	private static String dniRandom() {

		String dni = "";
		dni = faker.numerify("########") + faker.regexify("[A-HJ-NP-TV-Z]");

		return dni;

	}

	private static String nieRandom() {

		String nie = "";
		int randomNum = faker.random().nextInt(3);

		String nieInicial = "";

		switch (randomNum) {
		case 0:
			nieInicial = "X";
			break;
		case 1:
			nieInicial = "Y";
			break;
		case 2:
			nieInicial = "Z";
			break;
		}

		nie = nieInicial + faker.numerify("#######") + faker.regexify("[A-HJ-NP-TV-Z]");

		return nie;

	}

	public static String cvvRandom() {
		return String.valueOf(new Random().nextInt(900) + 100);
	}

}
