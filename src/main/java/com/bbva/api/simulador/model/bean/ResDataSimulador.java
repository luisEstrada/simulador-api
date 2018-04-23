package com.bbva.api.simulador.model.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ResDataSimulador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String textAyuda;
	private List<String> lstMeses;
	private BigDecimal montoMaximo;

	public String getTextAyuda() {
		return textAyuda;
	}

	public void setTextAyuda(String textAyuda) {
		this.textAyuda = textAyuda;
	}

	public List<String> getLstMeses() {
		return lstMeses;
	}

	public void setLstMeses(List<String> lstMeses) {
		this.lstMeses = lstMeses;
	}

	public BigDecimal getMontoMaximo() {
		return montoMaximo;
	}

	public void setMontoMaximo(BigDecimal montoMaximo) {
		this.montoMaximo = montoMaximo;
	}

}
