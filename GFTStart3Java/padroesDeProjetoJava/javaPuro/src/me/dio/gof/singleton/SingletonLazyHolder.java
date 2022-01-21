package me.dio.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="http://stackoverflow.com/a/24018148">Referência</a>
 * 
 * @author João Maurício Hernandes Carrenho
 */

public class SingletonLazyHolder {

		private static class Holder{
			public static SingletonLazyHolder instancia = new SingletonLazyHolder();
		}
		
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getIntancia() {
			return Holder.instancia;
		}

	}
