package view;

import controller.FuncionarioFactory;
import controller.FuncionarioInt;
import controller.FuncionarioParc;
import controller.FuncionarioTemp;

public class Principal {
	public static void main(String[] args) {

		
		FuncionarioFactory FuncionarioIntegral = new FuncionarioInt();
		FuncionarioFactory FuncionarioParcial = new FuncionarioParc();
		FuncionarioFactory FuncionarioTemporario = new FuncionarioTemp();
		
		System.out.println(FuncionarioIntegral.toString());

		System.out.println(FuncionarioParcial.toString());

		System.out.println(FuncionarioTemporario.toString());
		
	}

}
