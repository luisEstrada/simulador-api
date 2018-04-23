package com.bbva.api.simulador.model.bean;

import java.io.Serializable;

public class ReqDataSimulador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String simuladorId;

	public String getSimuladorId() {
		return simuladorId;
	}

	public void setSimuladorId(String simuladorId) {
		this.simuladorId = simuladorId;
	}

}
