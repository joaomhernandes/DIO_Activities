package me.dio.gof;

import me.dio.gof.facede.Facade;
import me.dio.gof.singleton.SingletonEager;
import me.dio.gof.singleton.SingletonLazy;
import me.dio.gof.singleton.SingletonLazyHolder;
import me.dio.gof.strategy.Comportamento;
import me.dio.gof.strategy.ComportamentoAgressivo;
import me.dio.gof.strategy.ComportamentoDefensivo;
import me.dio.gof.strategy.ComportamentoNormal;
import me.dio.gof.strategy.Robo;

/**
 * Testes relacionados ao Design Pattern
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class Test {

	public static void main(String[] args) {
		
		// Singleton:
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
				
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
				
		Facade facade = new Facade();
		facade.migrarCliente("João Mauricio", "13000-000");
		}

}
