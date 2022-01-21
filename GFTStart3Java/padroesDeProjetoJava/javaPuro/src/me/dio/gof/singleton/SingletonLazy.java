package me.dio.gof.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class SingletonLazy {
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getIntancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
