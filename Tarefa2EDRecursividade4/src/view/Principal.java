package view;

import javax.swing.JOptionPane;

import controller.ApareceNumeroController;

public class Principal {

	public static void main(String[] args) {
		ApareceNumeroController aparece = new ApareceNumeroController();
		int numero, numAparece;
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 e 999999"));
			numAparece = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0 e 9"));
		} while((numero < 10 || numero > 999999) || (numAparece < 0 || numAparece > 9));
		
		int result = aparece.QuantidadeApareceNumero(numero, numAparece);
		
		JOptionPane.showMessageDialog(null, "O numero aparece "+ result + " vezes.");
	}

}