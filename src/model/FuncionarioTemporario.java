package model;

import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {

	private LocalDate inicio;
	private LocalDate fim;
	
	
	public FuncionarioTemporario() {
		// TODO Auto-generated constructor stub
	}


	public LocalDate getInicio() {
		return inicio;
	}


	public void setInicio(int ano, int mes, int dia) {
		this.inicio = LocalDate.of(ano, mes, dia);;
	}


	public LocalDate getFim() {
		return fim;
	}


	public void setFim(int ano, int mes, int dia) {
		this.fim = LocalDate.of(ano, mes, dia);;
	}

	
	
}
