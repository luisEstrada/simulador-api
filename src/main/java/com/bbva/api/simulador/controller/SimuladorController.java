package com.bbva.api.simulador.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.api.simulador.model.bean.ReqDataSimulador;
import com.bbva.api.simulador.model.bean.ResDataSimulador;
import com.bbva.api.simulador.service.SimuladorService;

@RestController
public class SimuladorController {

	@Autowired
	private SimuladorService simuladorService;
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value="/simuladorData", method=RequestMethod.GET, produces="application/json;charset=UTF-8")
	@ResponseBody
	public ResDataSimulador getDataSimulador(@RequestParam(name="idSimulador") String idSimulador) {
		
		logger.info("INI SimuladorController - getDataSimulador");
		
		ResDataSimulador response = simuladorService.getDataSimulador(idSimulador);
		
		logger.info("FIN SimuladorController - getDataSimulador");
		
		return response;
	}
	
}
