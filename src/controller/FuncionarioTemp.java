package controller;

import model.FuncionarioTemporario;

public class FuncionarioTemp  extends FuncionarioFactory{

	public FuncionarioTemp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public model.Funcionario funcionarioContratacao() {
		FuncionarioTemporario FT = new FuncionarioTemporario();
		FT.setId(10);
		FT.setNome("Silva");
		FT.setSalario(1300f);
		FT.setInicio(2024,01,24);
		FT.setFim(2025,01,24);
		
		return FT;
		
	}

	public String toString() {
        FuncionarioTemporario funcionario = (FuncionarioTemporario) funcionarioContratacao();
        return "FuncionarioTemporario [id = " + funcionario.getId() + ", nome = " + funcionario.getNome() +
                ", salario = " + funcionario.getSalario() + ", inicio = " + funcionario.getInicio() +
                ", fim = " + funcionario.getFim() + "]";
    }

	
	
}
