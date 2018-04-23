package com.bbva.api.simulador.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bbva.api.simulador.model.bean.ResDataSimulador;
import com.bbva.api.simulador.service.SimuladorService;

@Service("simuladorService")
@Transactional(propagation = Propagation.SUPPORTS)
public class SimuladorServiceImpl implements SimuladorService{
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public ResDataSimulador getDataSimulador(String simuladorId) {
		
		logger.info("INI SimuladorServiceImpl - getDataSimulador");
		
		ResDataSimulador data = new ResDataSimulador();
		List<String> periodosCredito = new ArrayList<String>();
		
		if(simuladorId.equals("CREDITO_EFECTIVO")) {
			data.setMontoMaximo(new BigDecimal(50000));
			data.setTextAyuda("La mejor TCEA del mercado");
			periodosCredito.add("6 meses");
			periodosCredito.add("12 meses");
			data.setLstMeses(periodosCredito);
		}
		
		logger.info(data.getMontoMaximo() + " " + data.getTextAyuda() + " " + data.getLstMeses());

		logger.info("INI SimuladorServiceImpl - getDataSimulador");
		
		return data;
	}

}
