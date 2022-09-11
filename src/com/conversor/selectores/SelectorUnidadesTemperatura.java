package com.conversor.selectores;

import javax.swing.*;
import com.conversor.conversores.ValidarYConvertir;

/**
 * @version 1.0  
 * @author Cesar Rosa
**/

public class SelectorUnidadesTemperatura extends ValidarYConvertir implements InterfazSelectores {

	private String[] conversiones = { "De celcius a fahrenheit", "De celcius a kelvin", "De fahrenheit a celcius",
			"De fahrenheit a kelvin", "De kelvin a celcius", "De kelvin a fahrenheit" };
/**
 * Metodo sobreescrito de la interfaz Selectores OpcionesConversor en éste caso seleccionamos las unidades 
 * de Temperatura, la inicial y a la que queremos convertir .
**/
	@Override
	public void OpcionesConversor() {
		Icon icono = new ImageIcon("imagenes/cambioT.png");
		String resp1 = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversion",
				"Conversor de unidades de temperatura", JOptionPane.DEFAULT_OPTION, icono, conversiones,
				conversiones[0]);

		if (!(resp1 == null)) {

			switch (resp1) {

			case "De celcius a fahrenheit": {
				conversorTemperatura("De celcius a fahrenheit");
				break;
			}
			case "De celcius a kelvin": {
				conversorTemperatura("De celcius a kelvin");
				break;
			}
			case "De fahrenheit a celcius": {
				conversorTemperatura("De fahrenheit a celcius");
				break;
			}
			case "De fahrenheit a kelvin": {
				conversorTemperatura("De fahrenheit a kelvin");
				break;
			}
			case "De kelvin a celcius": {
				conversorTemperatura("De kelvin a celcius");
				break;
			}
			case "De kelvin a fahrenheit": {
				conversorTemperatura("De kelvin a fahrenheit");
				break;
			}
			default: {};
			}
		}
	}

}