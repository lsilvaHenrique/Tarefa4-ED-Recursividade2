package controller;

public class ApareceNumeroController {

	public ApareceNumeroController() {}
	
	public int QuantidadeApareceNumero(int numero, int numeroAparece) {
		// Condicao de parada --> Quando o numero for igual a 0
		if (numero == 0)
			return 0;
		else {
			if (numero % 10 == numeroAparece)
				return 1 + QuantidadeApareceNumero(numero / 10, numeroAparece);
			else
				return QuantidadeApareceNumero(numero / 10, numeroAparece);
			/*
			 523578 / 10 = 0
			 52357 / 10 = 0
			 5235 / 10 = 1
			 523 / 10 = 1
			 52 / 10 = 1
			 5 / 10 = 2
			 0 
			 */
		}
	}

}
