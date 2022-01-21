package subsistemaTwo.cep;

/**
 * Api CEP -  Facade' Subsystem.
 * 
 * @author Jo�o Maur�cio Hernandes Carrenho
 */

public class CepApi {

	private static CepApi instancia = new CepApi();
			
		private CepApi() {
			super();
		}
			
		public static CepApi getInstancia() {
			return instancia;
		}
		
		public String recuperarCidade(String cep) {
			return "Paul�nia";
		}
		
		public String recuperarEstado(String cep) {
			return "SP";
		}
}

