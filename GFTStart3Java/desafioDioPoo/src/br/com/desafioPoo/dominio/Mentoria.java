package br.com.desafioPoo.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		setTitulo(titulo);
		setDescricao(descricao);
		setData(data);
	}
		
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Override
	public String toString() {
		return "Mentoria [titulo="+ getTitulo() 
				+ ", descricao="+ getDescricao() 
				+ ", data=" + data.format(formatter) + "]";
	}

	
																
		

	
}
