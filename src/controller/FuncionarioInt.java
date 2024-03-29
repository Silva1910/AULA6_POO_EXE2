package controller;
import  model.*;
public class FuncionarioInt extends FuncionarioFactory{

	public FuncionarioInt() {
		super();
	}

	@Override
	public model.Funcionario funcionarioContratacao() {
		FuncionarioIntegral FI = new FuncionarioIntegral();
		FI.setId(10);
		FI.setNome("amos");
		FI.setSalario(1200f);
		FI.setBancoHoras(100);
		
		
		return FI;
	}
	@Override
	public String toString() {
        FuncionarioIntegral funcionario = (FuncionarioIntegral) funcionarioContratacao();
        return "Funcionario Integral [id = " + funcionario.getId() + ", nome = " + funcionario.getNome() +
                ", salario = " + funcionario.getSalario() + ", banco de horas = " + funcionario.getBancoHoras() +
                "] ";
    }


}
