package controller;
import model.Funcionario;
public abstract class FuncionarioFactory {

	
	public void  Funcionario(Funcionario F) {
		System.out.println(" iniciando contratação do funcionario com o ID"  );
		
	}
	
	public abstract Funcionario funcionarioContratacao();
	
}
