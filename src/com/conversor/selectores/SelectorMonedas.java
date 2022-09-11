package com.conversor.selectores;

import javax.swing.*;

import com.conversor.conversores.ValidarYConvertir;

/**
 * @version 1.0  
 * @author Cesar Rosa
**/

public class SelectorMonedas extends ValidarYConvertir implements InterfazSelectores {

	String[] conversiones = { "De pesos a dolar", "De pesos a euro", "De pesos a Libras", "De pesos a yen",
			"De pesos a Won coreano", "De dolar a pesos", "De Euro a pesos", "De libras a pesos",
			"De won coreano a pesos" };
	/**
	 * Metodo sobreescrito de la interfaz Selectores OpcionesConversor en éste caso seleccionamos las monedas,
	 * la inicial y a la que queremos convertir .
	**/
	@Override
	public void OpcionesConversor(){
		Icon icono = new ImageIcon("imagenes/cambioM.png");
		String resp1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversion",
				"Conversor de Moneda", JOptionPane.DEFAULT_OPTION, icono, conversiones, conversiones[0]);

		if (!(resp1 == null)) {

			switch (resp1) {

			case "De pesos a dolar": {
				ConversorMoneda(resp1, "ARS", "USD");
				break;
			}
			case "De pesos a euro": {
				ConversorMoneda(resp1, "ARS", "EUR");
				break;
			}
			case "De pesos a Libras": {
				ConversorMoneda(resp1, "ARS", "GBP");
				break;
			}
			case "De pesos a yen": {
				ConversorMoneda(resp1, "ARS", "JPY");
				break;
			}
			case "De pesos a Won coreano": {
				ConversorMoneda(resp1, "ARS", "KRW");
				break;
			}
			case "De dolar a pesos": {
				ConversorMoneda(resp1, "USD", "ARS");
				break;
			}
			case "De Euro a pesos": {
				ConversorMoneda(resp1, "EUR", "ARS");
				break;
			}
			case "De libras a pesos": {
				ConversorMoneda(resp1, "GBP", "ARS");
				break;
			}
			case "De won coreano a pesos": {
				ConversorMoneda(resp1, "KRW", "ARS");
				break;
			}
			default: {

			};
			}
		}
	}
}
