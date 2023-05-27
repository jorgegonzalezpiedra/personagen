package com.personagen.model.entity.usuario;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.personagen.model.entity.datosbancarios.DatosBancarios;
import com.personagen.model.entity.direccion.Direccion;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ApiModel(description = "${usuario.id.api.descripcion}")
public class Usuario {

	@ApiModelProperty(value = "${usuario.id.api.descripcion}", position = 0, example = "19928371")
	@Id
	String id;

	@ApiModelProperty(value = "${usuario.nombre.api.descripcion}", position = 1, example = "Jhon")
	private String nombre;

	@ApiModelProperty(value = "${usuario.apellido1.api.descripcion}", position = 2, example = "Doe")
	private String apellido1;

	@ApiModelProperty(value = "${usuario.apellido2.api.descripcion}", position = 3, example = "Smith")
	private String apellido2;

	@ApiModelProperty(value = "${usuario.dni.api.descripcion}", position = 4, example = "12345678A")
	private String dni;

	@ApiModelProperty(value = "${usuario.nie.api.descripcion}", position = 5, example = "Y1234567A")
	private String nie;

	@ApiModelProperty(value = "${usuario.nacionalidad.api.descripcion}", position = 6, example = "American")
	private String nacionalidad;

	@ApiModelProperty(value = "${usuario.email.api.descripcion}", position = 7, example = "jhonDoe@mail.com")
	private String email;

	@ApiModelProperty(value = "${usuario.fechanacimiento.api.descripcion}", position = 8, example = "01/12/1982")
	private String fechaNacimiento;

	@ApiModelProperty(value = "${usuario.nombreusuario.api.descripcion}", position = 9, example = "BigJhonDoe82")
	private String nombreUsuario;

	@ApiModelProperty(value = "${usuario.telefonos.api.descripcion}", position = 10, example = "916916871,646645633")
	private List<String> telefonos;

	@ApiModelProperty(value = "${usuario.direcciones.api.descripcion}")
	private List<Direccion> direcciones;

	@ApiModelProperty(value = "${usuario.datosbancarios.api.descripcion}")
	private List<DatosBancarios> datosBancarios;

}
