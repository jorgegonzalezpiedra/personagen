package com.personagen.model.entity.direccion;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Direccion {

	@ApiModelProperty(value = "${direccion.id.api.descripcion}", position = 1, example = "19288")
	@Id
	private String id;

	@ApiModelProperty(value = "${direccion.tipovia.api.descripcion}", position = 1, example = "19288")
	private String tipoVia;

	@ApiModelProperty(value = "${direccion.nombrevia.api.descripcion}", position = 1, example = "19288")
	private String nombreVia;

	@ApiModelProperty(value = "${direccion.numerovia.api.descripcion}", position = 1, example = "19288")
	private String numeroVia;

	@ApiModelProperty(value = "${direccion.numeropiso.api.descripcion}", position = 1, example = "19288")
	private String numeroPiso;

	@ApiModelProperty(value = "${direccion.letrapiso.api.descripcion}", position = 1, example = "19288")
	private String letraPiso;

	@ApiModelProperty(value = "${direccion.pais.api.descripcion}", position = 1, example = "19288")
	private String pais;

	@ApiModelProperty(value = "${direccion.comunidadautonoma.api.descripcion}", position = 1, example = "19288")
	private String comunidadAutonoma;

	@ApiModelProperty(value = "${direccion.provincia.api.descripcion}", position = 1, example = "19288")
	private String provincia;

	@ApiModelProperty(value = "${direccion.municipio.api.descripcion}", position = 1, example = "19288")
	private String municipio;

	@ApiModelProperty(value = "${direccion.codigopostal.api.descripcion}", position = 1, example = "19288")
	private String codigoPostal;

}
