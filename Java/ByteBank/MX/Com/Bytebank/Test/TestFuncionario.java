package bytebank.Mx.Com.Bytebank.Test;

import bytebank.Mx.Com.Bytebank.Modelo.Contador;
import bytebank.Mx.Com.Bytebank.Modelo.Funcionario;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setDocumento("Diego");
		diego.setDocumento("444556665");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}