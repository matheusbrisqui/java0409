package br.com.fiap;

import javax.swing.JOptionPane;

public class Praticando {

	public static void main(String[] args) {
		String frase;
		frase = JOptionPane.showInputDialog("Digite uma frase: ");
		
		// Exibindo a frase
		JOptionPane.showMessageDialog(null, frase);
		
		// Exibindo a quantidade de caracteres da frase
		int caracteres = frase.length();
		JOptionPane.showMessageDialog(null, "O número de caracteres é: " + caracteres);
		
		// Exibindo toda a frase em maiusculo
		String maiuscula = frase.toUpperCase();
		JOptionPane.showMessageDialog(null, maiuscula);
		
		// Solicitando duas palavras, uma que tenha na frase e outra para substituí-la
		String palavra;
		palavra = JOptionPane.showInputDialog("Escolha uma palavra da frase para substituir: ");
		
		String palavra2;
		palavra2 = JOptionPane.showInputDialog("Escolha a palavra substituta: ");
		
		String frase2 = frase.replace(palavra, palavra2);
		JOptionPane.showMessageDialog(null, frase2);
		
		// Exibindo o tamanho novo da frase
		int caracteres2 = frase2.length();
		JOptionPane.showMessageDialog(null, "O número de caracteres é: " + caracteres2);
		
		

	}

}
