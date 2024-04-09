package br.com.fiap;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		String frase = "O rato roeu a roupa do rei de Roma";
		JOptionPane.showMessageDialog(null, frase);
		
		//Exibindo a quantidade de caracteres
		int qtChar = frase.length();
		JOptionPane.showMessageDialog(null, qtChar);
		
		// Exibindo a frase em maisucula
		String maiusucla = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiusucla);
		
		// Exibindo a frase em minuscula
		String minuscula = frase.toLowerCase();
		JOptionPane.showMessageDialog(null, minuscula);
		
		// Obtendo e exibindo a palavra Roma
		String palavra = frase.substring(30,34);
		JOptionPane.showMessageDialog(null, palavra);
		
		// Substituindo a palavra roupa por parede
		String frase2 = frase.replace("roupa", "parede");
		JOptionPane.showMessageDialog(null, frase2);
	}
	
}
