package com.sysone;

public class StringCompress {

	public String Compress(String str) {
		StringBuilder compr = new StringBuilder();
		int contadorChar = 0;
		int contIteraccion = 0;
		char caracterAnterior = ' ';
		for (char c : str.toCharArray()) {
			contIteraccion++;
			c = Character.toUpperCase(c);

			if (caracterAnterior == c) {
				contadorChar++;
			} else {
				if (caracterAnterior != ' ') {
					compr = compr.append(contadorChar);
					compr = compr.append(caracterAnterior);
				}
				contadorChar = 1;
				caracterAnterior = c;
			}

			if (contIteraccion >= str.toCharArray().length) {
				compr = compr.append(contadorChar);
				compr = compr.append(caracterAnterior);
			}
		}
		String salida = compr.toString();
		return salida;
	}

}
