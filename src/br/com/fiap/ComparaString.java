package br.com.fiap;

import javax.swing.JOptionPane;

public class ComparaString {

	public static void main(String[] args) {
		String senha;
		senha = JOptionPane.showInputDialog("Digite sua senha: ");
		
		// Diferenciando minuscula e maiuscula
		if (senha.equals("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 1: Acesso negado!");
		}
		
		// Sem diferenciação das maiusculas e minusculas
		if(senha.equalsIgnoreCase("P4ssw0rD")) {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso concedido!");
		} else {
			JOptionPane.showMessageDialog(null, "Teste 2: Acesso impedido!");
		}
	}
	
}
