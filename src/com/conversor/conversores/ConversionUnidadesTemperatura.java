package com.conversor.conversores;

/**
 * @version 1.0  
 * @author Cesar Rosa
**/

public class ConversionUnidadesTemperatura {
	
	/**
	* Metodo que Conversor de unidades de Temperatura, recive 2 parametros el valor a convertir y el string para 
	* definir cuales son las unidades a convertir.
	**/	

	public double RetornaValorConvertido(String cadena, double valor) {
		double Retorno = 0.0;
		
		switch(cadena) {
		case "De celcius a fahrenheit":{
			Retorno = (valor* 1.8) + 32;
			break;
		}
		case "De celcius a kelvin": {
			Retorno = valor + 273.15;
			break;
		}
		case "De fahrenheit a celcius": {
			Retorno = (valor - 32) * 0.5555;
			break;
		}
		case "De fahrenheit a kelvin": {
			Retorno = ((valor - 32) * 0.5555) + 273.15;
			break;
		}
		case "De kelvin a celcius": {
			Retorno = valor - 273.15;
			break;
		}
		case "De kelvin a fahrenheit": {
			Retorno = ((valor - 273.15) * 1.8) + 32;
			break;
		}
		default: {};
		}
		return Retorno;
	}
}
