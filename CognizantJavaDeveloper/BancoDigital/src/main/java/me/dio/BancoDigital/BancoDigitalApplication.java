package me.dio.BancoDigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
	
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Cliente joao = new Cliente();
		joao.setNome("João Maurício");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		Conta ccjm = new ContaCorrente(joao);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.transferir(500, ccjm);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		ccjm.imprimirExtrato();
		
	}

}
