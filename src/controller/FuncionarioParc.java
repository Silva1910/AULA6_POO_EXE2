package controller;

import model.FuncionarioIntegral;
import model.FuncionarioParcial;

public class FuncionarioParc extends FuncionarioFactory {

	public FuncionarioParc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public model.Funcionario funcionarioContratacao() {

		FuncionarioParcial FP = new FuncionarioParcial();
		FP.setId(10);
		FP.setNome("Souza");
		FP.setSalario(1500f);
		FP.setHoraEntrada(08d);
		FP.setHoraSaida(18d);

		return FP;

	}

	@Override
	public String toString() {
        FuncionarioParcial funcionario = (FuncionarioParcial) funcionarioContratacao();
        return "Funcionario Parcial [id = " + funcionario.getId() + ", nome = " + funcionario.getNome() +
                ", salario = " + funcionario.getSalario() + ",  hora de entrada = " + funcionario.getHoraEntrada() + ",  hora de entrada = " + funcionario.getHoraSaida() +  
                "]";
    }

	
}
