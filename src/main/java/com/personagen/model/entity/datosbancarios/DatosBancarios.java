package com.personagen.model.entity.datosbancarios;

import org.springframework.data.annotation.Id;

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
public class DatosBancarios {

	@ApiModelProperty(value = "${usuario.id.descripcion}", position = 1, example = "19288")
	@Id
	private String id;

	@ApiModelProperty(value = "${datosbancarios.bic.api.descripcion}", position = 2, example = "Santander")
	private String bic;

	@ApiModelProperty(value = "${datosbancarios.iban.descripcion}", position = 3, example = "ES9130983026311148408095")
	private String iban;

	@ApiModelProperty(value = "${datosbancarios.numerotarjeta.api.descripcion}", position = 4, example = "4819950641113195")
	private String numeroTarjeta;

	@ApiModelProperty(value = "${datosbancarios.fechacaducidad.api.descripcion}", position = 5, example = "05/25")
	private String fechaCaducidad;

	@ApiModelProperty(value = "${datosbancarios.cvv.api.descripcion}", position = 6, example = "974")
	private String cvv;

	@ApiModelProperty(value = "${datosbancarios.nombretitular.api.descripcion}", position = 7, example = "Jhon Doe Smith")
	private String nombreTitular;
}
