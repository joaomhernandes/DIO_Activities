package me.dio.gof.facede;

/**
 * Facade Strategy Example.
 * 
 * @author João Maurício Hernandes Carrenho
 */

import subsistemaOne.crm.CrmService;
import subsistemaTwo.cep.CepApi;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
	}

}
