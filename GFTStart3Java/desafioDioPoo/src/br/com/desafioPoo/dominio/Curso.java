package br.com.desafioPoo.dominio;

public class Curso extends Conteudo{
	
	private int cargaHoraria;
	
	public Curso() {

	}
	
	public Curso(String titulo, String descricao, int cargaHoraria) {
		super();
		setTitulo(titulo);
		setDescricao(descricao);
		setCargaHoraria(cargaHoraria);
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * getCargaHoraria();
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "\nCurso: [Titulo = " + getTitulo() 
				+ "\nDescricao = " + getDescricao() 
				+ "\nCargaHoraria = " + cargaHoraria + "]";
	}


	
	

}
